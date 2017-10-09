package h04;

import java.applet.Applet;
import java.awt.*;

public class opdracht6 extends Applet{

    public void init(){ }

    public void paint (Graphics g){
        g.setColor(new Color (0xB20200));
        g.fillOval(20, 20, 100, 100);
        g.setColor(new Color(0xFFA300));
        g.fillOval(20, 130, 100, 100);
        g.setColor(new Color(0x56B201));
        g.fillOval(20, 240, 100, 100);
        g.setColor(new Color(0x000000));
        g.drawRect(20,20,100,320);



    }


}