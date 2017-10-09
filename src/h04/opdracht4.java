package h04;

import java.applet.Applet;
import java.awt.*;

public class opdracht4 extends Applet {

    public void init (){

    }
    public void paint (Graphics g ){

        g.drawLine(10,12,10,380);
        g.drawLine(9, 250, 300, 250);
        g.fillRect(30,200,30,50);
        g.drawString("valerie", 25,270);
        g.setColor(new Color(0x6CB223));
        g.fillRect(100,170,30,80);
        g.drawString("jeroen",100,270);
        g.setColor(new Color(0xB2072A));
        g.fillRect(170,140,30,110);
        g.drawString("Hans",170,270);
    }
}
