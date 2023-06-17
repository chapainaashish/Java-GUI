package EventHandling;

import java.awt.*;
import java.awt.event.*;

class ContainerListenerExample implements ContainerListener {
    ContainerListenerExample() {
        Frame frame = new Frame("Container Listener Example");
        frame.setLayout(new FlowLayout());

        Panel panel = new Panel();
        panel.addContainerListener(this);

        Button button1 = new Button("Button 1");
        Button button2 = new Button("Button 2");
        panel.add(button1);
        panel.add(button2);

        frame.add(panel);
        frame.setSize(300, 200);
        frame.setVisible(true);
    }

    public void componentAdded(ContainerEvent e) {
        System.out.println("Component Added: " + e.getChild().toString());
    }

    public void componentRemoved(ContainerEvent e) {
        System.out.println("Component Removed: " + e.getChild().toString());
    }

    public static void main(String[] args) {
        new ContainerListenerExample();
    }
}
