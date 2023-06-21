import java.awt.*;
import java.awt.event.*;

public class BasicFormExample {

    public BasicFormExample() {
        Frame f = new Frame();
        f.setLayout(new GridLayout(7, 2));

        // Lables
        Label nameLabel = new Label("Name:");
        Label genderLabel = new Label("Gender:");
        Label countryLabel = new Label("Country:");
        Label hobbiesLabel = new Label("Hobbies:");
        Label descriptionLabel = new Label("Description:");

        // Text Field
        TextField nameTextField = new TextField();

        // Choice (Drop down)
        Choice countryChoice = new Choice();
        countryChoice.add("USA");
        countryChoice.add("Australia");

        // Radio button
        CheckboxGroup genderCheckboxGroup = new CheckboxGroup();
        Checkbox maleCheckbox = new Checkbox("Male", genderCheckboxGroup, false);
        Checkbox femaleCheckbox = new Checkbox("Female", genderCheckboxGroup, false);

        // List (Multiple Choice)
        List hobbiesList = new List(4, true);
        hobbiesList.add("Reading");
        hobbiesList.add("Traveling");

        TextArea descriptionTextArea = new TextArea();

        Button submitButton = new Button("Submit");

        // Add components to the frame
        f.add(nameLabel);
        f.add(nameTextField);
        f.add(genderLabel);
        f.add(maleCheckbox);
        f.add(new Label()); // Empty label for spacing
        f.add(femaleCheckbox);
        f.add(countryLabel);
        f.add(countryChoice);
        f.add(hobbiesLabel);
        f.add(hobbiesList);
        f.add(descriptionLabel);
        f.add(descriptionTextArea);
        f.add(new Label()); // Empty label for spacing
        f.add(submitButton);

        // Add event listener for the submit button
        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Perform registration logic here
                String name = nameTextField.getText();
                String gender = genderCheckboxGroup.getSelectedCheckbox().getLabel();
                String country = countryChoice.getSelectedItem();
                String[] hobbies = hobbiesList.getSelectedItems();
                String description = descriptionTextArea.getText();

                // Print the collected data (You can replace this with your own logic)
                System.out.println("Name: " + name);
                System.out.println("Gender: " + gender);
                System.out.println("Country: " + country);
                System.out.print("Hobbies: ");
                for (String hobby : hobbies) {
                    System.out.print(hobby + ", ");
                }
                System.out.println();
                System.out.println("Description: " + description);
            }
        });

        f.setTitle("Registration Form");
        f.setSize(400, 300);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new BasicFormExample();
    }
}
