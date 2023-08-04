package Rough;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class FormRough {
    FormRough(){
        JFrame frame = new JFrame("Form Rough");
        frame.setSize(400, 400);
        frame.setLayout(new FlowLayout());

        JLabel name = new JLabel("Name");
        JTextField namefield = new JTextField(5);
        frame.add(name);
        frame.add(namefield);

        String options[] = {"Living", "Dying"};
        JComboBox<String> dropdown = new JComboBox(options);
        frame.add(dropdown);

        JCheckBox check1 = new JCheckBox("Hi");
        frame.add(check1);

        JRadioButton btn1 = new JRadioButton("Radio 1");
        JRadioButton btn2 = new JRadioButton("Radio 2");

        ButtonGroup btngroup = new ButtonGroup();
        btngroup.add(btn1);
        btngroup.add(btn2);

        frame.add(btn1);
        frame.add(btn2);

        JButton btn = new JButton("SUbmit");
        frame.add(btn);

        // Processing Data
        btn.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        String name  = namefield.getText();
                        namefield.setText("HIIIIIII");
                        String hobby = (String)dropdown.getSelectedItem();

                        boolean ischecked  = check1.isSelected();


                        boolean btn1selected = btn1.isSelected();
                        boolean btn2selected = btn2.isSelected();

                        System.out.println(name + "\n" + hobby);
                    }
                }

        );

        frame.setVisible(true);
    }

    public static void main(String[] args){
        new FormRough();
    }
}
