package Layout;

import javax.swing.*;
import java.awt.*;

public class JTableExample {
    public static void main(String[] args) {
            JFrame frame = new JFrame("Basic JTable Example");
            frame.setLayout(new BorderLayout());

            // Sample data
            Object[][] data = {
                    {"John", 25,},
                    {"Alice", 30},
            };

            // Column headers
            String[] columnNames = {"Name", "Age"};

            // Create the JTable using data and column headers
            JTable table = new JTable(data, columnNames);

            // Add the JScrollPane to the center of the JFrame
            frame.add(table, BorderLayout.CENTER);

            // Set JFrame size and make it visible
            frame.setSize(400, 300);
            frame.setVisible(true);
    }
}

