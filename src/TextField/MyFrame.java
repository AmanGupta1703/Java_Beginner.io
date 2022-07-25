package TextField;
import javax.swing.JTextField;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    JButton button;
    JTextField textField;
    public MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        textField = new JTextField();
        textField.setPreferredSize(new Dimension(250,40));
        textField.setFont(new Font("Consolas", Font.PLAIN, 35));
        textField.setForeground(Color.green);
        textField.setBackground(Color.BLACK);
        textField.setCaretColor(Color.WHITE);

        button = new JButton("Submit");
        button.setFocusable(false);
        button.setForeground(Color.pink);
        button.addActionListener(this);

        this.add(button);
        this.add(textField);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button) {
                System.out.println("Welcome "+ textField.getText());
                //button.setEnabled(false);
                //textField.setEditable(false);
                this.dispose();
        }
    }
}