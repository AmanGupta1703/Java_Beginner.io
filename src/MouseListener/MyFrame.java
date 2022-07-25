package MouseListener;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyFrame extends JFrame implements MouseListener {
    JLabel label;

    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);

        label = new JLabel();
        label.setBounds(100,100,100,100);
        label.setBackground(Color.cyan);
        label.setOpaque(true);
        label.addMouseListener(this);

        this.add(label);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        //System.out.println("You clicked your mouse. "+ e.getClickCount());
        label.setBackground(Color.cyan);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        //System.out.println("You pressed the mouse"+ e.getLocationOnScreen());
        label.setBackground(Color.green);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        label.setBackground(Color.cyan);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("You entered the component");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("You exited from the component");
    }
}
