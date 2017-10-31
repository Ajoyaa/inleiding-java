package h06;

import java.applet.Applet;
import java.awt.*;

public class opdracht2 extends Applet {

    int uitkomst1;
    int uitkomst2;
    int uitkomst3;

        int seconds;
            int hour;
            int day;
            int year;

    public void init(){
        seconds = 60;
        hour    = 60;
        day     = 24;
        year    = 365;


        uitkomst1 = seconds*hour;
        uitkomst2 = seconds*hour*day;
        uitkomst3 = seconds*hour*day*year;
    }

    public void paint (Graphics g) {
        g.drawString("seconds in een uur:  " + uitkomst1,20,20);
        g.drawString("seconden in een dag:  " + uitkomst2,20,40);
        g.drawString("seconden in jaar:  " + uitkomst3,20,60);

    }
}
