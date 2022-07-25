package GUILoginWindow;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginWindow extends JFrame implements ActionListener {

    JButton button;
    JPasswordField passwordField;
    JLabel passwordLabel;
    JTextField userText;
    JLabel userLabel;
    JPanel panel;
    JLabel successfulLogin;
    JLabel unsuccessfulLogin;
    public LoginWindow() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(350,200);

        panel = new JPanel();
        panel.setLayout(null);

        userLabel = new JLabel("Username : ");
        userLabel.setFont(new Font("Consolas", Font.PLAIN, 12));
        userLabel.setBounds(10,20,80,25);

        userText = new JFormattedTextField();
        userText.setFont(new Font("Consolas", Font.PLAIN, 12));
        userText.setBounds(100,20,165,25);

        passwordLabel = new JLabel("Password : ");
        passwordLabel.setFont(new Font("Consolas", Font.PLAIN, 12));
        passwordLabel.setBounds(10,50,80,25);

        passwordField = new JPasswordField();
        passwordField.setFont(new Font("Consolas", Font.PLAIN, 12));
        passwordField.setBounds(100,50,165,25);

        button = new JButton("Login");
        button.setForeground(new Color(0,0,0));
        button.setBounds(10, 80, 80, 25);

        button.addActionListener(this);

        successfulLogin = new JLabel("");
        successfulLogin.setBounds(10,110,300,25);

        unsuccessfulLogin = new JLabel("");
        unsuccessfulLogin.setBounds(10,110,300,25);

        panel.add(unsuccessfulLogin);
        panel.add(successfulLogin);
        panel.add(button);
        panel.add(passwordLabel);
        panel.add(passwordField);
        panel.add(userText);
        panel.add(userLabel);

        this.add(panel);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String user = userText.getText();
        String password = String.valueOf(passwordField.getPassword());
        if(user.equals("Aman") && password.equals("Aman123")) {
            successfulLogin.setText("Successful Login!");
            unsuccessfulLogin.setText("");
        }   else {
            successfulLogin.setText("");
            unsuccessfulLogin.setText("Incorrect Password or Username.");
        }

        if(e.getSource()==button) {
            System.out.println("Username : "+ user);
            System.out.println("Password : "+ password);
            System.out.println();
        }

    }
}
