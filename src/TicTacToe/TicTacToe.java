package TicTacToe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;


public class TicTacToe implements ActionListener {
    Random rand = new Random();
    JFrame frame = new JFrame();
    JPanel title_panel = new JPanel();
    JPanel buttons_panel = new JPanel();
    JTextField textfield = new JTextField();
    JButton[] buttons = new JButton[9];
    boolean player1_turn;

    TicTacToe() {
        //set the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,800);
        frame.getContentPane().setBackground(new Color(25,25,25));
        frame.setLayout(new BorderLayout());


        //set the textField (title)
        textfield.setBackground(new Color(25,25,25));
        textfield.setForeground(new Color(25,255,0));
        textfield.setFont(new Font("Ink Free",Font.BOLD,75));
        textfield.setText("Tic-Tac-Toe");
        textfield.setHorizontalAlignment(JLabel.CENTER);
        textfield.setOpaque(true);

        // set the title panel and then add textField to the title_panel and title_panel to the frame
        title_panel.setLayout(new BorderLayout());
        title_panel.setBounds(0,0,800,100);

        buttons_panel.setLayout(new GridLayout(3,3));
        buttons_panel.setBackground(new Color(150,150,150));

        for(int i=0; i<9; i++) {
            buttons[i] = new JButton();
            buttons_panel.add(buttons[i]);
            buttons[i].setFont(new Font("MV Boli",Font.BOLD,120));
            buttons[i].setFocusable(false);
            buttons[i].addActionListener(this);
        }

        title_panel.add(textfield);
        frame.add(title_panel, BorderLayout.NORTH);
        frame.add(buttons_panel);

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        firstTurn();
    }

    public void actionPerformed(ActionEvent e) {

        for(int i=0;i<9;i++) {
            if(e.getSource()==buttons[i]) {
                if(player1_turn) {
                    if(buttons[i].getText()=="") {
                        buttons[i].setForeground(new Color(255,0,0));
                        buttons[i].setText("X");
                        player1_turn=false;
                        textfield.setText("O turn");
                        Check();
                    }
                }
                else {
                    if(buttons[i].getText()=="") {
                        buttons[i].setForeground(new Color(0,0,255));
                        buttons[i].setText("O");
                        player1_turn=true;
                        textfield.setText("X turn");
                        Check();
                    }
                }
            }
        }
    }



    public void firstTurn() {
        try {
            Thread.sleep(5);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        if(rand.nextInt(2)==0) {
            player1_turn=true;
            textfield.setText("X Turn");
        } else {
            player1_turn=false;
            textfield.setText("O Turn");
        }
    }

    // Check the winning sequence
    public void Check() {
        // 1st row
        if(
                (buttons[0].getText() =="X") &&
                (buttons[1].getText() =="X") &&
                (buttons[2].getText() =="X")
        ) {
            xWins(0,1,2);
        }

        // 2nd row
        if(
                (buttons[3].getText() =="X") &&
                (buttons[4].getText() =="X") &&
                (buttons[5].getText() =="X")
        ) {
            xWins(3,4,5);
        }

        //3 row
        if(
                (buttons[6].getText() =="X") &&
                (buttons[7].getText() =="X") &&
                (buttons[8].getText() =="X")
        ) {
            xWins(6,7,8);
        }
        // --- diff winn meth
        if(
                        (buttons[0].getText() =="X") &&
                        (buttons[3].getText() =="X") &&
                        (buttons[6].getText() =="X")
        ) {
            xWins(0,3,6);
        }

        // 2nd row
        if(
                        (buttons[1].getText() =="X") &&
                        (buttons[4].getText() =="X") &&
                        (buttons[7].getText() =="X")
        ) {
            xWins(1,4,7);
        }

        //3 row
        if(
                        (buttons[2].getText() =="X") &&
                        (buttons[5].getText() =="X") &&
                        (buttons[8].getText() =="X")
        ) {
            xWins(2,5,8);
        }
        // --- diff winn meth
        if(
                        (buttons[0].getText() =="X") &&
                        (buttons[4].getText() =="X") &&
                        (buttons[8].getText() =="X")
        ) {
            xWins(0,4,8);
        }

        // 2nd row
        if(
                        (buttons[2].getText() =="X") &&
                        (buttons[4].getText() =="X") &&
                        (buttons[6].getText() =="X")
        ) {
            xWins(2,4,6);
        }

        // O turn
        if(
                        (buttons[0].getText() =="O") &&
                        (buttons[1].getText() =="O") &&
                        (buttons[2].getText() =="O")
        ) {
            oWins(0,1,2);
        }

        // 2nd row
        if(
                        (buttons[3].getText() =="O") &&
                        (buttons[4].getText() =="O") &&
                        (buttons[5].getText() =="O")
        ) {
            oWins(3,4,5);
        }

        //3 row
        if(
                        (buttons[6].getText() =="O") &&
                        (buttons[7].getText() =="O") &&
                        (buttons[8].getText() =="O")
        ) {
            oWins(6,7,8);
        }
        // --- diff winn meth
        if(
                        (buttons[0].getText() =="O") &&
                        (buttons[3].getText() =="O") &&
                        (buttons[6].getText() =="O")
        ) {
            oWins(0,3,6);
        }

        // 2nd row
        if(
                        (buttons[1].getText() =="O") &&
                        (buttons[4].getText() =="O") &&
                        (buttons[7].getText() =="O")
        ) {
            oWins(1,4,7);
        }

        //3 row
        if(
                        (buttons[2].getText() =="O") &&
                        (buttons[5].getText() =="O") &&
                        (buttons[8].getText() =="O")
        ) {
            oWins(2,5,8);
        }
        // --- diff winn meth
        if(
                        (buttons[0].getText() =="O") &&
                        (buttons[4].getText() =="O") &&
                        (buttons[8].getText() =="O")
        ) {
            oWins(0,4,8);
        }

        // 2nd row
        if(
                        (buttons[2].getText() =="O") &&
                        (buttons[4].getText() =="O") &&
                        (buttons[6].getText() =="O")
        ) {
            oWins(2,4,6);
        }
    }

    // to check whether Player x wins
    public void xWins(int a, int b, int c) {
        buttons[a].setBackground(Color.GREEN);
        buttons[b].setBackground(Color.GREEN);
        buttons[c].setBackground(Color.GREEN);
        textfield.setText("X Wins");

        for(int i=0; i<9; i++) {
            buttons[i].setEnabled(false);
        }
    }

    //to check whether o wins
    public void oWins(int a, int b, int c) {
        buttons[a].setBackground(Color.green);
        buttons[b].setBackground(Color.green);
        buttons[c].setBackground(Color.green);
        textfield.setText("0 Wins");

        for(int i=0; i<9; i++) {
            buttons[i].setEnabled(false);
        }
    }

}
