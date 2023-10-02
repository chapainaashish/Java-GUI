package Theory;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ImageMoveDemo extends JFrame {
    private int x = 200;
    private int y = 200;
    private int imageSize = 200;

    public ImageMoveDemo() {
        setTitle("Image Move Demo");
        setSize(500, 500);
        setVisible(true);

        addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                int keyCode = e.getKeyCode();
                if (keyCode == KeyEvent.VK_LEFT) x -= 10;
                else if (keyCode == KeyEvent.VK_RIGHT)  x += 10;
                else if (keyCode == KeyEvent.VK_UP) y -= 10;
                else if (keyCode == KeyEvent.VK_DOWN) y += 10;
                repaint();
            }
        });
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.BLUE);
        g.fillRect(x, y, imageSize, imageSize);
    }

    public static void main(String[] args) {
        new ImageMoveDemo();
    }
}
