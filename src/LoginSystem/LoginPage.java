package LoginSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class LoginPage implements ActionListener {
    JFrame frame  = new JFrame();
    JButton loginButton = new JButton("Login");
    JButton resetButton = new JButton("Reset");
    JTextField userIDField = new JTextField();
    JPasswordField userPasswordField = new JPasswordField();
    JLabel userIDLabel = new JLabel("Username : ");
    JLabel userPasswordLabel = new JLabel("Password : ");
    JLabel messageLabel = new JLabel();
    HashMap<String,String> logininfo;
    LoginPage(HashMap<String,String> loginInfoOriginal) {

        userIDLabel.setBounds(50,100,75,25);
        userPasswordLabel.setBounds(50,150,75,25);

        messageLabel.setBounds(125,250,250,35);
        messageLabel.setFont(new Font("Ink Free",Font.BOLD,25));

        userIDField.setBounds(125,100,200,25);
        userPasswordField.setBounds(125,150,200,25);

        loginButton.setBounds(125,200,100,25);
        loginButton.setFocusable(false);
        loginButton.addActionListener(this);

        resetButton.setBounds(225,200,100,25);
        resetButton.setFocusable(false);
        resetButton.addActionListener(this);

        frame.add(userIDLabel);
        frame.add(userPasswordLabel);
        frame.add(messageLabel);
        frame.add(userIDField);
        frame.add(userPasswordField);
        frame.add(loginButton);
        frame.add(resetButton);

        frame.setDefaultCloseOperation(3);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        logininfo = loginInfoOriginal;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==resetButton) {
            userIDField.setText("");
            userPasswordField.setText("");
            messageLabel.setText("");
        }
        if(e.getSource()==loginButton) {
            String userID = userIDField.getText();
            String  password = String.valueOf(userPasswordField.getPassword());

            if(logininfo.containsKey(userID)) {
                if(logininfo.get(userID).equals(password)) {
                    messageLabel.setForeground(Color.green);
                    messageLabel.setText("Login Successful.");
                    frame.dispose();
                    NewWindow welcomePage = new NewWindow(userID);
                } else {
                    messageLabel.setForeground(Color.red);
                    messageLabel.setText("Login Unsuccessful.");
            }
            } else {
                messageLabel.setForeground(Color.red);
                messageLabel.setText("Username not found.");
            }
        }
    }
}
