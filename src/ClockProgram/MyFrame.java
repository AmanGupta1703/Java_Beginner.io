package ClockProgram;

import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MyFrame extends JFrame {

    SimpleDateFormat timeFormat;
    SimpleDateFormat dayFormat;
    SimpleDateFormat dateFormat;
    JLabel timeLabel;
    JLabel dayLabel;
    JLabel dateLabel;
    String time;
    String day;
    String date;

    public MyFrame() {
        this.setDefaultCloseOperation(3);
        this.setTitle("Clock Program.");
        this.setLayout(new FlowLayout());
        this.setSize(350,200);
        this.getContentPane().setBackground(Color.black);
        this.setResizable(false);

        timeFormat = new SimpleDateFormat("hh:mm:ss a");
        dayFormat = new SimpleDateFormat("EEEE");
        dateFormat = new SimpleDateFormat("MMMMM dd, yyyy");

        timeLabel = new JLabel();
        timeLabel.setFont(new Font("Verdana",Font.PLAIN,50));
        timeLabel.setForeground(new Color(0x00FF00));
        timeLabel.setBackground(Color.black);
        timeLabel.setOpaque(true);

        dayLabel = new JLabel();
        dayLabel.setFont(new Font("Verdana",Font.PLAIN,35));
        dayLabel.setForeground(new Color(0x00FF00));
        dayLabel.setBackground(Color.black);
        dayLabel.setOpaque(true);

        dateLabel = new JLabel();
        dateLabel.setFont(new Font("Verdana",Font.PLAIN,25));
        dateLabel.setForeground(new Color(0x00FF00));
        dateLabel.setBackground(Color.black);
        dateLabel.setOpaque(true);

        this.add(timeLabel);
        this.add(dayLabel);
        this.add(dateLabel);
        this.setVisible(true);

        setTime();
    }

    public void setTime() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        while(true) {
            time = timeFormat.format(Calendar.getInstance().getTime());
            timeLabel.setText(time);

            day = dayFormat.format(Calendar.getInstance().getTime());
            dayLabel.setText(day);

            date = dateFormat.format(Calendar.getInstance().getTime());
            dateLabel.setText(date);
        }

    }
}
