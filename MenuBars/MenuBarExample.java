package MenuBars;

import java.awt.*;
import java.awt.event.*;

public class MenuBarExample {
    MenuBarExample() {
        Frame frame = new Frame("Menu Bar Example");
        MenuBar menuBar = new MenuBar();

        Menu fileMenu = new Menu("File");
        Menu editMenu = new Menu("Edit");

        MenuItem saveItem = new MenuItem("Save");
        MenuItem exitItem = new MenuItem("Exit");
        MenuItem copyItem = new MenuItem("Copy");
        MenuItem pasteItem = new MenuItem("Paste");

        fileMenu.add(saveItem);
        fileMenu.addSeparator();
        fileMenu.add(exitItem);
        editMenu.add(copyItem);
        editMenu.add(pasteItem);

        menuBar.add(fileMenu);
        menuBar.add(editMenu);

        frame.setMenuBar(menuBar);
        frame.setSize(300, 200);
        frame.setVisible(true);

        exitItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        new MenuBarExample();
    }
}
