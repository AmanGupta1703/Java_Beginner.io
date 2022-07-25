package GUIProgressBar;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ProgressBar implements ActionListener {
    JFrame frame = new JFrame();
    JProgressBar progressBar = new JProgressBar();
    JButton button = new JButton("Click");

    public ProgressBar() {

        button.setBounds(120,50,100,50);
        button.setEnabled(false);

        progressBar.setValue(0);
        progressBar.setBounds(0,0,420,50);
        progressBar.setStringPainted(true);
        progressBar.setFont(new Font("Consolas", Font.PLAIN, 20));

        frame.add(button);
        frame.add(progressBar);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setVisible(true);

        fill();
    }

    public void fill() {
        int counter = 0;
        while(counter <= 100) {
            progressBar.setValue(counter);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            counter += 1;
        }
        progressBar.setString("Done");
        button.setEnabled(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button) {

        }
    }
}
