package h04;

import java.applet.Applet;
import java.awt.*;


public class opdracht5 extends Applet{

    public  void paint(Graphics g) {


        g.setColor(Color.BLUE);
        g.fillOval(10,10,200,200);

//        g.setColor(Color.YELLOW);
//        g.fillArc(10,10,200,200,0,60);
//        g.fillArc(10,10,200,200,120,60);
//        g.fillArc(10,10,200,200,240,60);



        g.setColor(Color.BLACK);
        g.drawOval(10,10,200,200);
    }
}