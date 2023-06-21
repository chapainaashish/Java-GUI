package Layout;
import java.awt.*;
import java.awt.event.*;
import java.io.File;

public class FileDialogExample {
    FileDialogExample() {
        Frame frame = new Frame("File Dialog Example");

        Button button = new Button("Open File Dialog");
        button.setBounds(100, 100, 200, 30);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                FileDialog fileDialog = new FileDialog(frame, "Select File", FileDialog.LOAD);
                // Set the current directory for the file dialog (optional)
                fileDialog.setDirectory("/");
                fileDialog.setVisible(true);
                File selectedFile = new File(fileDialog.getDirectory(), fileDialog.getFile());
                System.out.println("Selected File: " + selectedFile.getAbsolutePath());
            }
        });

        frame.add(button);
        frame.setSize(400, 300);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new FileDialogExample();
    }
}

