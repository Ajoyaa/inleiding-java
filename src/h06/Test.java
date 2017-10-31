package h06;

import java.awt.*;
import java.applet.*;


public class Test extends Applet {
    int a;
    int b;
    int c;
    int uitkomst;

    public void init() {

        a = 7;
        b = 8;
        c = 3;
        uitkomst = (a + b + b);
    }

    public void paint(Graphics g) {
        g.drawString("De uitkomst is: " + uitkomst, 20, 20);
        g.drawString("test", 20,45);
    }
}