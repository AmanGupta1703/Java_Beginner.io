package ColorChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    JLabel label;
    JButton button;

    public MyFrame() {
        this.setDefaultCloseOperation(3);
        this.setLayout(new FlowLayout());

        button = new JButton("Pick a Color...");
        button.setFocusable(false);
        button.addActionListener(this);

        label = new JLabel();
        label.setText("Thi is some text :D");
        label.setFont(new Font("Ink Free", Font.BOLD, 100));
        label.setBackground(Color.white);
        label.setOpaque(true);

        this.add(button);
        this.add(label);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button) {
            JColorChooser colorChooser = new JColorChooser();

            Color color = JColorChooser.showDialog(null,"Pick a color...I guess", Color.BLACK);
            label.setForeground(color);
        }
    }
}
