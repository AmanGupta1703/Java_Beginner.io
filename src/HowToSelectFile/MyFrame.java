package HowToSelectFile;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public  class MyFrame extends JFrame implements ActionListener {
    JButton button;
    public MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button = new JButton("Select File");
        button.setFocusable(false);
        button.addActionListener(this);

        this.add(button);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button) {
            JFileChooser fileChooser = new JFileChooser();
            //fileChooser.showOpenDialog(null);
            fileChooser.showSaveDialog(null);

            File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
            System.out.println("File Name : " + file);
        }
    }
}
