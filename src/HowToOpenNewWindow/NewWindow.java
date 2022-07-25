package HowToOpenNewWindow;

import javax.swing.*;
import java.awt.*;

public class NewWindow {
    JFrame frame = new JFrame();
    JPanel redPanel = new JPanel();
    JPanel bluePanel = new JPanel();
    JLabel label = new JLabel();
    NewWindow(){

        redPanel.setBackground(Color.red);
        bluePanel.setBackground(Color.BLUE);

        redPanel.setPreferredSize(new Dimension(100,100));
        bluePanel.setPreferredSize(new Dimension(100,100));

        label.setBounds(0, 0, 10, 10);
        label.setFont(new Font("Arial", Font.PLAIN, 20));

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(new BorderLayout());
        frame.setVisible(true);
        redPanel.add(label);
        frame.add(redPanel, BorderLayout.NORTH);
        frame.add(bluePanel, BorderLayout.SOUTH);

    }
}
