package Layout;

import java.awt.*;

public class FlowLayoutExample {
    FlowLayoutExample() {
        Frame frame = new Frame("Flow Layout Example");
        frame.setLayout(new FlowLayout());
        frame.setSize(300, 200);
        frame.setVisible(true);

        Button button1 = new Button("Button 1");
        Button button2 = new Button("Button 2");
        Button button3 = new Button("Button 3");
        Button button4 = new Button("Button 4");
        Button button5 = new Button("Button 5");
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);
        frame.add(button5);
    }
    public static void main(String[] args) {
        new FlowLayoutExample();
    }
}
