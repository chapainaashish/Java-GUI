package Theory;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddNum {
    AddNum(){
        JFrame frame = new JFrame("Add Number");
        frame.setSize(200, 200);
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);

        JTextField t1 = new JTextField(20);
        JTextField t2 = new JTextField(20);

        JButton submit  = new JButton("Submit");
        JLabel l1 = new JLabel();

        frame.add(t1);
        frame.add(t2);
        frame.add(submit);
        frame.add(l1);

        submit.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String num1 = (String) t1.getText();
                String num2 = (String) t2.getText();

                int num3 = Integer.parseInt(num1);
                int num4 = Integer.parseInt(num2);

                int result = num3+num4;

                String resultStr = String.valueOf(result);
                l1.setText("Result: "+resultStr);

            }
        });

    }

    public static void main(String args[]){
        new AddNum();
    }
}
