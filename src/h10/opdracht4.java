package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class opdracht4 extends Applet {

    int cijfer;
    TextField tekstvak;
    Label label;
    String tekst;
    Button ok;



    public void init() {
        tekstvak = new TextField("", 5);
        tekstvak.addActionListener(new VakListener());
        tekst = "";

        label = new Label("geef uw leeftijd in en druk op enter");



        add(label);
        add(tekstvak);
    }

    public void paint(Graphics g) {
        g.drawString(tekst, 50, 45);
    }

    class VakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s;

            s = tekstvak.getText();
            cijfer = Integer.parseInt(s);
            if (cijfer > 5.4) {
                tekst = "je hebt een voldoende";
                repaint();
            } else {
                tekst = "je hebt een onvoldoende";
            }
            repaint();

        }
    }

        class knopListner implements ActionListener {
            public void actionPerformed( ActionEvent e) {
                tekst = ("");
                tekst = tekstvak.getText();
            }

        }
    }
