package Layout;
import javax.swing.*;
import java.io.*;

public class JFileChooserExample {
    JFileChooserExample(){
        JFrame frame = new JFrame("Card Layout");
        frame.setSize(300, 200);
        frame.setVisible(true);

        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory(new File("/"));

        int result = fileChooser.showOpenDialog(frame);
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            System.out.println("Selected file: " + selectedFile.getAbsolutePath());
        }
    }
    public static void main(String args[]){
        new JFileChooserExample();
    }

}