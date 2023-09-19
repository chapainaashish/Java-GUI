package Layout;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class CardLayoutExample extends JFrame implements ActionListener {
    CardLayout card;
    Container cPane;

    CardLayoutExample(){
        setTitle("CardExample");
        setSize(300, 300);
        setVisible(true);

        cPane = getContentPane();
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