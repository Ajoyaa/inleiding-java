package h08;

import java.applet.Applet;
import java.awt.*;

public class knop_zichtbaar_maken extends Applet {
    Button knop;


    public void init(){
        knop = new Button();
        knop.setLabel("klik op mij");
        add(knop);
    }

    public void paint(Graphics g) {
        g.drawString("doet deze knop wel iets?",50,60);

    }
}
