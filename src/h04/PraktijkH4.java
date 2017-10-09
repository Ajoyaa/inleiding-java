package h04;

import java.applet.Applet;
import java.awt.*;

public class  PraktijkH4 extends Applet {

    public void init() {}

    public void paint (Graphics g) {

        g.drawLine(15,25,300,25);
        g.drawString("Lijn",150,45);

        g.drawRect(10,50,300,150);
        g.drawString("rechthoek",145,220);

        g.drawRoundRect(10,230,300,150,10,10);
        g.drawString("Afgeronde rechthoek",110,395);

        g.setColor(new Color(0xFF00FF));
        g.fillRect(320,50,300,150);
        g.setColor(Color.BLACK);
        g.drawOval(320,50,300,150);
        g.drawString("Gevulde rechthoek met ovaal",395,220);

        g.setColor(new Color(0xFF00FF));
        g.fillOval(320,230,300,150);
        g.setColor(Color.BLACK);
        g.drawString("gevulde ovaal",425,395);


        g.drawArc(630,50,300,150,0,360);
        g.drawString("Taart met ovaal eromheen",720,220);

        g.setColor(new Color (0xFF00FF));
        g.fillArc(630,50,300,150,360,45);
        g.setColor(new Color(0));
        g.drawString("Cirkel",785,400);

        g.setColor(Color.BLACK);
        g.drawOval(725,230,150,150);



    }
}
