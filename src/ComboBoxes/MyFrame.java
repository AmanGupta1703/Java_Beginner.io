package ComboBoxes;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    JComboBox comboBox;
    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        String[] animals = {"Dog", "Cat", "Pig"};
        comboBox = new JComboBox(animals);
        comboBox.addItem("Horse");
        comboBox.addActionListener(this);

        this.add(comboBox);
        this.setSize(350,350);
        //this.pack();
        this.setResizable(false);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==comboBox) {
            System.out.println(comboBox.getSelectedIndex());
        }
    }
}
