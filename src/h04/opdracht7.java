package h04;

import java.applet.Applet;
import java.awt.*;

public class opdracht7 extends Applet {

    public void init(){}

    public void paint (Graphics g){


        g.drawRect(50,50,70,70);
        g.setColor(new Color(0x04FF00) );
        g.fillOval(53,53,19,19);
        g.fillOval(53,100,19,19);
        g.fillOval(100,53,19,19);
        g.fillOval(100,100,19,19);
    }

}

