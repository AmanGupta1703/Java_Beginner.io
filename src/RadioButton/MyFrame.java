package RadioButton;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    JRadioButton koreanFood;
    JRadioButton chineseFood;
    JRadioButton japaneseFood;
    ButtonGroup buttonGroup;
    public MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        //radio buttons -> a group of buttons in which only one can be selected
        koreanFood = new JRadioButton("Korean Food");
        chineseFood = new JRadioButton("Chinese Food");
        japaneseFood = new JRadioButton("Japanese Food");

        koreanFood.setFocusable(false);
        chineseFood.setFocusable(false);
        japaneseFood.setFocusable(false);

        koreanFood.addActionListener(this);
        chineseFood.addActionListener(this);
        japaneseFood.addActionListener(this);

        buttonGroup = new ButtonGroup();    //Grouping the radio buttons
        buttonGroup.add(koreanFood);
        buttonGroup.add(chineseFood);
        buttonGroup.add(japaneseFood);

        this.add(koreanFood);
        this.add(chineseFood);
        this.add(japaneseFood);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==koreanFood) {
            System.out.println("You have selected to eat korean food.");
        } else if(e.getSource()==chineseFood) {
            System.out.println("You have selected to eat chinese food.");
        } else if(e.getSource()==japaneseFood) {
            System.out.println("You have selected to eat japanese food.");
        }
    }
}
