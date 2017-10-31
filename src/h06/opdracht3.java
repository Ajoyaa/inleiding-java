package h06;

import java.applet.Applet;
import java.awt.*;

    public class opdracht3 extends Applet {
        int a;
        int b;

        public void init(){

            a = 100;
            b = 300;

}


    public void paint (Graphics g) {

            g.drawString("de uitkomst is:  "  + - (a + b),50,50);
    }
}
