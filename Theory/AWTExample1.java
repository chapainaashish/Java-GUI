package Theory;

// Using Inheritance
import java.awt.*;

// extending Frame class to our class AWTExample1
public class AWTExample1 extends Frame {
   AWTExample1() {
      // frame configuration
      setSize(300,300);
      setTitle("This is our basic AWT example");
      setLayout(null);
      setVisible(true);
}

public static void main(String args[]) {
       AWTExample1 f = new AWTExample1();
}
}