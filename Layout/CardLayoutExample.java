package Layout;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class CardLayoutExample implements ActionListener {
    CardLayout card;
    Container cPane;

    CardLayoutExample(){
        JFrame frame = new JFrame("Card Layout");
        frame.setSize(300, 200);
        frame.setLayout(null);
        frame.setVisible(true);

        cPane = frame.getContentPane();
        card = new CardLayout();
        cPane.setLayout(card);

        JButton btn1 = new JButton("Apple");
        JButton btn2 = new JButton("Boy");
        btn1.addActionListener(this);
        btn2.addActionListener(this);

        // first card is btn1 and so on
        cPane.add("a", btn1);
        cPane.add("b", btn2);
    }

    public void actionPerformed(ActionEvent e) {
        card.next(cPane);
    }

    public static void main(String arg[]) {
        new CardLayoutExample();
    }
}