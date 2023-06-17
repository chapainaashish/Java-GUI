package EventHandling;

import java.awt.*;
import java.awt.event.*;

class WindowListenerExample implements WindowListener {
    WindowListenerExample() {
        Frame frame = new Frame("Window Listener Example");
        frame.addWindowListener(this);
        frame.setSize(300, 200);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    public void windowOpened(WindowEvent e) {
        System.out.println("Window Opened");
    }

    public void windowClosing(WindowEvent e) {
        System.out.println("Window Closing");
        System.exit(0);
    }

    public void windowClosed(WindowEvent e) {
        System.out.println("Window Closed");
    }

    public void windowIconified(WindowEvent e) {
        System.out.println("Window Iconified");
    }

    public void windowDeiconified(WindowEvent e) {
        System.out.println("Window Deiconified");
    }

    public void windowActivated(WindowEvent e) {
        System.out.println("Window Activated");
    }

    public void windowDeactivated(WindowEvent e) {
        System.out.println("Window Deactivated");
    }

    public static void main(String[] args) {
        new WindowListenerExample();
    }
}
