package Theory;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import javax.swing.table.DefaultTableModel;

public class DatabaseTable extends JFrame {
    private JTable table;
    private DefaultTableModel tableModel;

    public DatabaseTable() {
        setTitle("Student Data in JTable");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Initialize the JTable with a DefaultTableModel
        tableModel = new DefaultTableModel();
        tableModel.addColumn("Student ID");
        tableModel.addColumn("Student Name");
        tableModel.addColumn("Student Class");

        table = new JTable(tableModel);

        try {
            // Replace with your database connection details
            String jdbcUrl = "jdbc:mysql://localhost:3306/your_database";
            String username = "your_username";
            String password = "your_password";

            Connection connection = DriverManager.getConnection(jdbcUrl, username, password);
            Statement statement = connection.createStatement();

            // Replace "your_query" with your SQL query to retrieve student data
            String query = "SELECT student_id, student_name, student_class FROM student_table";

            ResultSet resultSet = statement.executeQuery(query);

            // Iterate through the ResultSet and add rows to the DefaultTableModel
            while (resultSet.next()) {
                int studentId = resultSet.getInt("student_id");
                String studentName = resultSet.getString("student_name");
                String studentClass = resultSet.getString("student_class");
                Object[] row = {studentId, studentName, studentClass};
                tableModel.addRow(row);
            }

            resultSet.close();
            statement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        pack();
        setLocationRelativeTo(null);
    }



    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            DatabaseTable example = new DatabaseTable();
            example.setVisible(true);
        });
    }
}

