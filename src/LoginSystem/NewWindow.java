package LoginSystem;

import javax.swing.*;
import java.awt.*;

public class NewWindow {
    JFrame frame = new JFrame();
    JLabel label = new JLabel("Helllo");

    NewWindow(String userID) {

        label.setBounds(200,200,200,35);
        label.setForeground(Color.LIGHT_GRAY);
        label.setFont(new Font("MV Boli", Font.BOLD,25));
        label.setText("Hello "+ userID);

        frame.add(label);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
