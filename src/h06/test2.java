package h06;


import java.awt.*;
import java.applet.*;


public class test2 extends Applet {
    int geheelBedrag;
    int A;
    int uitkomst;


    public void init() {
        geheelBedrag = 133;
        A = 4;
        uitkomst = geheelBedrag / A;
    }

    public void paint(Graphics g) {
        g.drawString("De uitkomst is: " + uitkomst, 20, 20);
        g.drawString("justin: " + uitkomst, 20, 40);
        g.drawString("jan: " + uitkomst, 20, 60);
        g.drawString("ali: " + uitkomst, 20, 80);
        g.drawString("jeannette: " + uitkomst, 20, 100);


    }
}


