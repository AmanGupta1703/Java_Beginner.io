package CheckBox;
import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    JButton button;
    JCheckBox checkBox;
    public MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button = new JButton("Submit");
        button.setFocusable(false);
        button.addActionListener(this);

        checkBox = new JCheckBox();
        checkBox.setText("I am not a Robot");
        checkBox.setFocusable(false);
        checkBox.setBackground(new Color(128, 131, 134, 186));
        checkBox.setFont(new Font("Consolas", Font.PLAIN,35));
        checkBox.setForeground(Color.WHITE);

        this.add(button);
        this.add(checkBox);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button) {
            System.out.println(checkBox.isSelected());
            this.dispose();
        }
    }
}
