package GUIMenuBars;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.plaf.basic.BasicBorders;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class MyFrame extends JFrame implements ActionListener {
    JFrame frame;
    JMenu fileMenu;
    JMenu editMenu;
    JMenu helpMenu;
    JMenuItem loadItem;
    JMenuItem saveItem;
    JMenuItem exitItem;
    JMenuItem copyItem;
    JMenuItem pasteItem;
    JMenuItem deleteItem;
    JMenuItem findItem;
    JMenuItem aboutItem;
    JMenuItem submitItem;
    public MyFrame() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(new FlowLayout());

        JMenuBar menuBar = new JMenuBar();
        menuBar.setBorder(new BasicBorders.MarginBorder());

        //MenuTitle
        fileMenu = new JMenu("File");
        editMenu = new JMenu("Edit");
        helpMenu = new JMenu("Help");

        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);

        //Menu Item(1) for file menu
        loadItem = new JMenuItem("Load");
        saveItem = new JMenuItem("Save");
        exitItem = new JMenuItem("Exit");

        // Menu item(2) for the edit menu
        copyItem = new JMenuItem("Copy");
        pasteItem = new JMenuItem("Save");
        deleteItem = new JMenuItem("Delete");

        // Menu item(3) for the help menu
        findItem = new JMenuItem("Find");
        aboutItem = new JMenuItem("About");
        submitItem = new JMenuItem("Submit");

        //add menu item(1) to the file menu
        fileMenu.add(loadItem);
        fileMenu.add(saveItem);
        fileMenu.add(exitItem);

        // add menu item(2) to the edit menu
        editMenu.add(copyItem);
        editMenu.add(pasteItem);
        editMenu.add(deleteItem);

        //add menu item(3) to the help menu
        helpMenu.add(findItem);
        helpMenu.add(aboutItem);
        helpMenu.add(submitItem);

        // adding action listener to the menu items
        loadItem.addActionListener(this);
        saveItem.addActionListener(this);
        exitItem.addActionListener(this);

        copyItem.addActionListener(this);
        pasteItem.addActionListener(this);
        deleteItem.addActionListener(this);

        findItem.addActionListener(this);
        aboutItem.addActionListener(this);
        submitItem.addActionListener(this);

        //KeyBoard shortCuts
        loadItem.setMnemonic(KeyEvent.VK_L);

        frame.setJMenuBar(menuBar);
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==loadItem){
            System.out.println("***Loading the file**");
        } else if (e.getSource()==saveItem) {
            System.out.println("***Saving the file**");
        } else if (e.getSource()==exitItem) {
            System.exit(0);
        } else if (e.getSource()==copyItem) {
            System.out.println("***Copying the file**");
        } else if (e.getSource()==pasteItem) {
            System.out.println("***Paste the data**");
        } else if (e.getSource()==deleteItem) {
            System.out.println("***Delete the file**");
        } else if (e.getSource()==findItem) {
            System.out.println("***Finding the file**");
        } else if (e.getSource()==aboutItem) {
            System.out.println("***-- About Us -- **");
        } else if (e.getSource()==submitItem) {
            System.out.println("***Submitted the file**");
        }
    }
}
