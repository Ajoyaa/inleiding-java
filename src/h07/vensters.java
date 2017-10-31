package h07;

import java.applet.Applet;
import java.awt.*;

public class vensters extends Applet {

    public void init(){
        setSize(400, 300);
    }

    public void paint(Graphics g){
        g.drawString("welcome to jave!",50,60);

        Dimension dim = new Dimension(400,300);
        this.setSize(dim);
    }
}
