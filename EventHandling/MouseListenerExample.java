package EventHandling;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

class MouseListenerExample implements MouseListener {
    MouseListenerExample() {
        Frame frame = new Frame("Mouse Listener Example");
        Button b = new Button("Click or hover");
        b.setBounds(50,50,50,50);
        b.addMouseListener(this);
        frame.add(b);
        frame.setSize(300, 200);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    public void mouseClicked(MouseEvent e) {
        System.out.println("Mouse clicked");
    }

    public void mousePressed(MouseEvent e) {
        System.out.println("Mouse pressed");
    }

    public void mouseReleased(MouseEvent e) {
        System.out.println("Mouse released");
    }

    public void mouseEntered(MouseEvent e) {
        System.out.println("Mouse entered");
    }

    public void mouseExited(MouseEvent e) {
        System.out.println("Mouse exited");
    }

    public static void main(String[] args) {
        new MouseListenerExample();
    }
}

