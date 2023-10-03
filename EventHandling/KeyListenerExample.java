package EventHandling;

import java.awt.*;
import java.awt.event.*;

class KeyListenerExample implements KeyListener {
    KeyListenerExample() {
        Frame frame = new Frame("KeyListener Example");
        TextArea b = new TextArea();
        b.setBounds(50, 50, 50, 50);
        b.addKeyListener(this);
        frame.add(b);
        frame.setSize(300, 200);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    public void keyPressed(KeyEvent e) {
        System.out.println("Key Pressed");
    }

    public void keyReleased(KeyEvent e) {
        System.out.println("Key Released");
    }

    public void keyTyped(KeyEvent e) { System.out.println("Key Typed"); }

    public static void main(String[] args) {
        new KeyListenerExample();
    }
}
