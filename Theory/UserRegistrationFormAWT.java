package Theory;

import java.awt.*;
import java.awt.event.*;

public class UserRegistrationFormAWT extends Frame implements ActionListener {

    private Label nameLabel, countryLabel, hobbiesLabel, radioButtonLabel;
    private TextField nameTextField;
    private Choice countryChoice;
    private Checkbox writingCheckbox, readingCheckbox;
    private CheckboxGroup radioButtonGroup;
    private Button submitButton;

    public UserRegistrationFormAWT() {
        // Frame
        setTitle("Basic Form Example");
        setSize(400, 400);
        setLayout(new GridLayout(0, 1));

        // Label
        nameLabel = new Label("Name");
        add(nameLabel);

        // Text Field
        nameTextField = new TextField(20);
        add(nameTextField);

        // Dropdown (Choice)
        countryLabel = new Label("Country");
        add(countryLabel);

        countryChoice = new Choice();
        countryChoice.add("Nepal");
        countryChoice.add("India");
        countryChoice.add("China");
        add(countryChoice);

        // Checkbox
        hobbiesLabel = new Label("Hobbies");
        add(hobbiesLabel);

        writingCheckbox = new Checkbox("Writing");
        readingCheckbox = new Checkbox("Reading");
        add(writingCheckbox);
        add(readingCheckbox);

        // Radio Buttons
        radioButtonLabel = new Label("Radio Buttons");
        add(radioButtonLabel);

        radioButtonGroup = new CheckboxGroup();
        Checkbox radioButton1 = new Checkbox("Radio Button 1", radioButtonGroup, false);
        Checkbox radioButton2 = new Checkbox("Radio Button 2", radioButtonGroup, false);
        add(radioButton1);
        add(radioButton2);

        // Button
        submitButton = new Button("Submit");
        add(submitButton);
        submitButton.addActionListener(this);

        // Window listener to handle closing the window
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String name = nameTextField.getText();
        String country = countryChoice.getSelectedItem();
        boolean writingSelected = writingCheckbox.getState();
        boolean readingSelected = readingCheckbox.getState();
        String radioButtonSelected = radioButtonGroup.getSelectedCheckbox().getLabel();

        // Check for form validation
        if (name.isEmpty() || country.isEmpty()) {
            showMessageDialog("Please fill in all required fields.");
            return; // Stop form submission if any required field is empty
        }

        // Print the data in the terminal
        System.out.println("Name: " + name);
        System.out.println("Country: " + country);
        System.out.println("Writing selected: " + writingSelected);
        System.out.println("Reading selected: " + readingSelected);
        System.out.println("Radio button selected: " + radioButtonSelected);

        // Optionally, you can reset the form fields after successful submission:
        nameTextField.setText("");
        countryChoice.select(0);
        writingCheckbox.setState(false);
        readingCheckbox.setState(false);
    }

    private void showMessageDialog(String message) {
        Dialog dialog = new Dialog(this, "Error", true);
        Label label = new Label(message);
        dialog.add(label);
        dialog.setSize(300, 100);
        dialog.setLocationRelativeTo(this);
        dialog.setVisible(true);
    }

    public static void main(String[] args) {
        new UserRegistrationFormAWT();
    }
}
