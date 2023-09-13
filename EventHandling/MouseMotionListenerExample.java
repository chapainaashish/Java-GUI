package EventHandling;

import java.awt.*;
import java.awt.event.*;

class MouseMotionListenerExample implements MouseMotionListener {
    MouseMotionListenerExample() {
        Frame frame = new Frame("MouseMotionListener Example");
        Label label = new Label("Mouse Coordinates:");
        label.setBounds(20, 20, 150, 20);
        frame.add(label);

        // Create a TextArea to display mouse coordinates
        TextArea textArea = new TextArea();
        textArea.setBounds(20, 50, 260, 120);
        frame.add(textArea);

        // Add the MouseMotionListener to the TextArea
        textArea.addMouseMotionListener(this);

        frame.setSize(300, 200);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    public void mouseMoved(MouseEvent e) {
        // Get the mouse coordinates and display them
        int x = e.getX();
        int y = e.getY();
        System.out.println("Mouse Moved - X: " + x + ", Y: " + y);
    }

    public void mouseDragged(MouseEvent e) {
        // This method is invoked when the mouse is dragged (moved while a button is held down)
    }

    public static void main(String[] args) {
        new MouseMotionListenerExample();
    }
}
