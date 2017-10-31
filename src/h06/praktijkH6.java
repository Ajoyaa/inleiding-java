package h06;

import java.applet.Applet;
import java.awt.*;


public class praktijkH6 extends Applet {

    double getal1;
    double getal2;
    double getal3;
    double gemiddelde;

    public void init(){

     getal1 = 5.9;
     getal2 = 6.3;
     getal3 = 6.9;

     gemiddelde = (getal1 + getal2 + getal3) /3;
     gemiddelde = (int) (gemiddelde * 10);
     gemiddelde = gemiddelde / 10;
    }

    public void paint (Graphics g){
        g.setColor(new Color(0xB20200));
        g.drawString("gemiddelde is :   "+ gemiddelde, 50,50 );


    }
}
