package h04;

import java.applet.Applet;
import java.awt.*;

public class Getalraden extends Applet{


    TextField vak;
    Button knop;
    String tekst="Ik bedenk 'n getal (1-100)";
    int ronde = 1, keer, x, geheim;
    public void init() {
        setBackground (Color.white);
        vak = new TextField(10);
        knop = new Button ("Klik");
        add (vak);
        add (knop);
        geheim = 1+(int)(100*Math.random());
    }
    public void paint (Graphics g) {
        g.drawString (tekst,40,100);
        g.drawString ("Klik om door te gaan",40,160);
        vak.setText("");
        vak.requestFocus();
    }
    public boolean action (Event e, Object o) {
        if (e.target == knop) {
            ronde++;
            switch(ronde) {
                case 1:
                    tekst="Ik bedenk 'n getal (1-100)";break;
                case 2:
                    tekst="Probeer jij het te raden."; break;
                case 3:
                    tekst="Tik een getal in ..."; break;
                default:
                    try {
                        String woord = vak.getText();
                        x = Integer.parseInt(woord);
                    } catch(NumberFormatException exc){
                        tekst = "geen correct getal ... ";
                        repaint();
                        return false;
                    }
                    keer++;
                    if (x > geheim)
                        tekst=x+" is te hoog, probeer nog eens.";
                    else if (x < geheim)
                        tekst=x+" is te laag, probeer nog eens.";
                    else {
                        tekst=x+" geraden in " + keer + " keer.";
                        ronde = keer = 0;
                        do {
                            geheim = 1+(int)(100*Math.random());
                        } while (x == geheim);
                    }
            }
            repaint();
            return true;
        }
        return false;
    }
}
