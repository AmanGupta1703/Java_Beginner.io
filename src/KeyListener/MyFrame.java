package KeyListener;

import jdk.swing.interop.SwingInterOpUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyFrame extends JFrame implements KeyListener {

    JLabel label;

    public MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500,500);
        this.addKeyListener(this);

        label = new JLabel();
        label.setBounds(0,0,100,100);
        label.setBackground(Color.cyan);
        label.setOpaque(true);

        this.getContentPane().setBackground(Color.black);
        this.add(label);
        this.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        switch(e.getKeyChar()) {
            case 'a': label.setLocation(label.getX()-10, label.getY());
            break;
            case 'w': label.setLocation(label.getX(), label.getY()-10);
            break;
            case 'd': label.setLocation(label.getX()+10, label.getY());
            break;
            case 's': label.setLocation(label.getX(), label.getY()+10);
            break;
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch(e.getKeyCode()) {
            case 37: label.setLocation(label.getX()-20, label.getY());
                break;
            case 39: label.setLocation(label.getX()+20, label.getY());
                break;
            case 38: label.setLocation(label.getX(), label.getY()-20);
                break;
            case 40: label.setLocation(label.getX(), label.getY()+20);
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("You released key code : "+ e.getKeyCode());
        System.out.println("You released key Char : "+ e.getKeyChar());
        System.out.println("===============================");
    }
}
