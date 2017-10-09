package h04;

import java.applet.Applet;
import java.awt.*;

public class opdracht2 extends Applet {

    public void init(){

    }
    public void paint (Graphics g) {


        g.drawRect(130,130,160,160);
        g.drawLine(130, 130, 210, 35);
        g.drawLine(290, 130, 210, 35);
        g.drawLine(291, 130, 130, 130);
        g.drawRect(140,140,45,40);
        g.drawLine(140,140,190,185);

        g.drawRect(190,200,50,90);

    }
}
