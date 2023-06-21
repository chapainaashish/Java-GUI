package Layout;

import java.awt.*;

public class BorderLayoutExample {
    BorderLayoutExample() {
        Frame frame = new Frame("BorderLayout Example");
        frame.setLayout(new BorderLayout(19,49));

        Button button1 = new Button("North");
        Button button2 = new Button("South");
        Button button3 = new Button("East");
        Button button4 = new Button("West");
        Button button5 = new Button("Center");

        frame.add(button1, BorderLayout.NORTH);
        frame.add(button2, BorderLayout.SOUTH);
        frame.add(button3, BorderLayout.EAST);
        frame.add(button4, BorderLayout.WEST);
        frame.add(button5, BorderLayout.CENTER);

        frame.setSize(300, 200);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new BorderLayoutExample();
    }
}

