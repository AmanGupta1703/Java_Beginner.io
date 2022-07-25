package SliderDemo;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class GUISlider implements ChangeListener {
    JFrame frame;
    JPanel panel;
    JLabel label;
    JSlider slider;
    public GUISlider() {

        frame = new JFrame();
        panel = new JPanel();
        label = new JLabel("Temperatue!");
        slider = new JSlider(0,100,50);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("GUI Slider");

        slider.setPreferredSize(new Dimension(400,200));
        //slider.setPaintTicks(true);
        slider.setMinorTickSpacing(10);
        //slider.setPaintTrack(true);
        slider.setMajorTickSpacing(25);
        slider.setPaintLabels(true);
        slider.addChangeListener(this);


        label.setFont(new Font("MV Boli", Font.PLAIN, 15));

        panel.add(slider);
        panel.add(label);

        frame.add(panel);
        //frame.setSize(420,420);
        frame.pack();
        frame.setVisible(true);


    }

    @Override
    public void stateChanged(ChangeEvent e) {
        label.setText("Degree Celsius : "+ slider.getValue());
    }
}
