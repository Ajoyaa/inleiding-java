package h04;

import java.applet.Applet;
import java.awt.*;

public class opdracht3 extends Applet {
    public void init (){

    }

    public void paint (Graphics g ) {
        g.setColor(Color.lightGray);
        g.drawLine(10,290, 10,150);
        g.setColor(Color.red);
        g.fillRect(10,150,90,20);
        g.setColor(Color.white);
        g.fillRect(10,170,90,20);
        g.setColor(Color.blue);
        g.fillRect(10,190,90,20);
    }
}
