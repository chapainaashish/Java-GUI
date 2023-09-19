package Layout;
// Java program to demonstrate GridBagLayout class.
import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.*;

// class extends JFrame
public class GridBagLayoutExample extends JFrame {
    GridBagLayoutExample() {
        setTitle("GridBagLayoutDemo");
        setSize(600, 400);
        setVisible(true);

		JPanel p = new JPanel();
        p.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();

		c.insets = new Insets(2, 2, 2, 2);
		c.gridx = 0;
		c.gridy = 0;
        c.ipadx = 15;
		c.ipady = 50;
		p.add(new JButton("Java Swing"), c);

        c.gridx = 1;
        c.ipadx = 90;
        c.ipady = 40;
        p.add(new JButton("Layout"), c);

		c.gridx = 0;
        c.gridy = 1;
        c.ipadx = 20;
        c.ipady = 20;
        p.add(new JButton("Manager"), c);

		c.ipadx = 10;
        c.gridx = 1;
        p.add(new JButton("Demo"), c);


		getContentPane().add(p);

	}

	public static void main(String[] args) {
        new GridBagLayoutExample();
	}
}
