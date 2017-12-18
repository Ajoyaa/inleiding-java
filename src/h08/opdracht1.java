package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class opdracht1 extends Applet {

    private Button ok;
    private Button reset;
    private TextField inputField;
    private Label clickHere;
    private String userInput;
    private String resetInput;

    public void init() {
        setSize(500, 150);

        ok = new Button("OK");
        ok.addActionListener(new OkListener());
        add(ok);

        reset = new Button("Reset");
        reset.addActionListener(new ResetListener());
        add(reset);

        inputField = new TextField(20);

        clickHere = new Label("          Click here!    -->     ");
        add(clickHere);
        add(inputField);

        userInput = "";
        resetInput = "";

    }


    public void paint(Graphics g) {

        g.drawString("Your input: " + userInput, 20, 100);
    }


    class OkListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            userInput = inputField.getText();
            repaint();

        }
    }

    class ResetListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            userInput = resetInput;
            inputField.setText("");
            repaint();
        }
    }
}
