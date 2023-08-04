package Layout;

import java.awt.*;
import java.awt.event.*;

public class DialogBoxExample {
   DialogBoxExample() {
        Frame frame = new Frame("Dialog Box Example");

        Button button = new Button("Click here to do student attendance! ");
        button.setBounds(100, 100, 300, 30);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Dialog dialog = new Dialog(frame, "Dialog Box");
                dialog.setLayout(new FlowLayout());

                Label label = new Label("Done Bro");
                Button closeButton = new Button("Close");

                // Add components to the dialog box
                dialog.add(label);
                dialog.add(closeButton);
                dialog.setSize(200, 150);
                dialog.setVisible(true);

                closeButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                       dialog.dispose();
                    }
                });
            }
        });

        frame.add(button);
        frame.setSize(400, 300);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new DialogBoxExample();
    }
}
