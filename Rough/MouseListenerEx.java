package Rough;

import java.awt.*;
import java.awt.event.*;


public class MouseListenerEx implements MouseListener{
    MouseListenerEx(){
        Frame f = new Frame("Mouse Listener Example");
        Button b = new Button("Click");
        b.setBounds(50,30, 60, 50);
        f.setSize(200, 200);
        f.setLayout(null);
        f.setVisible(true);
        f.add(b);
        b.addMouseListener(this);
    }

    public void mouseClicked(MouseEvent e){
        System.out.println("MOuse done");
    }

    public void mousePressed(MouseEvent e){
                System.out.println("MOuse done");


    }

    public void mouseEntered(MouseEvent e){
                System.out.println("MOuse done");


    }

    public void mouseExited(MouseEvent e){
                System.out.println("MOuse done");


    }

    public void mouseReleased(MouseEvent e){
                System.out.println("MOuse done");


    }


    public static void main(String args[]){
        new MouseListenerEx();
    }


}
