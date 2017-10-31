package h06;

import java.applet.Applet;
import java.awt.*;

public class opdracht1 extends Applet {

        int geheelBedrag;
        int A;
        int uitkomst;


        public void init(){
            geheelBedrag = 133;
            A = 4;
            uitkomst = geheelBedrag/A;
    }

    public void paint(Graphics g) {
        g.drawString("De uitkomst is:" + uitkomst,20,30);
        g.drawString("ahmad:" + uitkomst,20,50);
        g.drawString("jan:" +uitkomst,20,65);
        g.drawString("ali:" + uitkomst,20,80);
        g.drawString("jeannette:" + uitkomst,20,95);

    }



}
