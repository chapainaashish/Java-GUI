package EventHandling;

import java.awt.*;
import java.awt.event.*;

class MouseListenerAdapter {
    MouseListenerAdapter() {
        Frame frame = new Frame("Mouse Listener Example");
        Button b = new Button("Click or hover");
        b.setBounds(50, 50, 50, 50);

        MouseAdapter mouseAdapter = new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                System.out.println("Mouse clicked");
            }
            public void mousePressed(MouseEvent e) {
                System.out.println("Mouse pressed");
            }
        };
        b.addMouseListener(mouseAdapter);
        frame.add(b);
        frame.setSize(300, 200);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new MouseListenerAdapter();
    }
}

