package Layout;
import javax.swing.*;
import java.io.*;

public class JFileChooserExample extends JFrame{
    JFileChooserExample(){
        setTitle("File Chooser");
        setSize(300, 300);
        setLayout(null);
        setVisible(true);

        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory(new File("/"));

        int result = fileChooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            System.out.println("Selected file: " + selectedFile.getAbsolutePath());
        }
    }
    public static void main(String args[]){
        new JFileChooserExample();
    }

}
