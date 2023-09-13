package Theory;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class UserRegistrationForm {

    public UserRegistrationForm() {

        // Frame
        JFrame frame = new JFrame("Basic Form Example");
        frame.setSize(400, 400);
        frame.setLayout(new GridLayout(0, 1));
        frame.setVisible(true);


        // Label
        JLabel label = new JLabel("Name");
        frame.add(label);

        // Text Field
        JTextField textField = new JTextField(20);
        frame.add(textField);

        // Dropdown (Combo Box)
        String[] dropdownOptions = {"Nepal", "India", "China"};
        JComboBox<String> dropdown = new JComboBox(dropdownOptions);
        frame.add(dropdown);

        // Checkbox
        JCheckBox checkbox1 = new JCheckBox("Writing");
        JCheckBox checkbox2 = new JCheckBox("Reading");
        frame.add(checkbox1);
        frame.add(checkbox2);

        // Radio Buttons
        JRadioButton radioButton1 = new JRadioButton("Radio Button 1");
        JRadioButton radioButton2 = new JRadioButton("Radio Button 2");

        // to check only one
        ButtonGroup buttongroup = new ButtonGroup();
        buttongroup.add(radioButton1);
        buttongroup.add(radioButton2);

        frame.add(radioButton1);
        frame.add(radioButton2);

        // Button
        JButton submit = new JButton("Submit");
        frame.add(submit);

        // Action listener for the Submit button
        submit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = textField.getText();
                String country = (String) dropdown.getSelectedItem();
                boolean writingSelected = checkbox1.isSelected();
                String isWriting = checkbox1.getText();
                boolean readingSelected = checkbox2.isSelected();
                String radioButtonSelected = radioButton1.isSelected() ? "Radio Button 1" : "Radio Button 2";

                // Check for form validation
                if (name.isEmpty() || country.isEmpty()) {
                    JOptionPane.showMessageDialog(frame, "Please fill in all required fields.");
                    return; // Stop form submission if any required field is empty
                }

                // Print the data in the terminal
                System.out.println("Name: " + name);
                System.out.println("Country: " + country);
                System.out.println("Writing selected: " + writingSelected);
                System.out.println("Reading selected: " + readingSelected);
                System.out.println("Str: " + isWriting);
                System.out.println("Radio button selected: " + radioButtonSelected);

                // Optionally, you can reset the form fields after successful submission:
                textField.setText("");
                dropdown.setSelectedIndex(0);
                checkbox1.setSelected(false);
                checkbox2.setSelected(false);
                radioButton1.setSelected(true);
            }
        });
    }

    public static void main(String[] args) {
        new UserRegistrationForm();
    }
}
