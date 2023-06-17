package EventHandling;

import java.awt.*;
import java.awt.event.*;

public class ActionListenerExample implements ActionListener {
    ActionListenerExample(){
        Frame f = new Frame("ActionListener Example");
        Button b = new Button("Click Here");
        b.setBounds(50, 100, 60, 30);
        b.addActionListener(this);
        f.add(b);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        System.out.println("Welcome");
    }

    public static void main(String[] args) {
        new ActionListenerExample();
    }

}
