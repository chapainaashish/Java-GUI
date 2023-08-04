import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RadioButtonApplet extends Applet implements ActionListener {
    private CheckboxGroup radioGroup;
    private TextArea resultTextArea;

    public void init() {
        // Set the layout for the applet
        setLayout(new BorderLayout());

        // Create the radio buttons
        radioGroup = new CheckboxGroup();
        Checkbox option1 = new Checkbox("Option 1", radioGroup, false);
        Checkbox option2 = new Checkbox("Option 2", radioGroup, false);
        Checkbox option3 = new Checkbox("Option 3", radioGroup, false);


        // Create a text area to display the selected option
        resultTextArea = new TextArea(5, 30);
        resultTextArea.setEditable(false);

        // Add components to the applet
        add(option1, BorderLayout.NORTH);
        add(option2, BorderLayout.CENTER);
        add(option3, BorderLayout.SOUTH);
        add(resultTextArea, BorderLayout.EAST);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Handle radio button selection events
        String selectedOption = radioGroup.getSelectedCheckbox().getLabel();
        resultTextArea.setText("Selected Option: " + selectedOption);
    }
}
