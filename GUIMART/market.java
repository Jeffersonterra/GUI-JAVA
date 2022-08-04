package GUIMART;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class market {

    private static JLabel welcome;
    private static JTextField item1;
    private static JTextField item2;
    private static JTextField item3;
    private static JLabel itemone;
    private static JLabel itemtwo;
    private static JLabel itemthree;

    public static void main(String args[]) {
        JFrame frame = new JFrame();// creates frame and can name frame
        JPanel panel = new JPanel();
        ImageIcon image = new ImageIcon("C:/Users/jefferson/Documents/GitHub/myCode/GUI/super.png");
        frame.setVisible(true);// makes frame visible
        frame.setTitle("Super DuppperMart");// sets title
        frame.add(panel);
        frame.setResizable(true);// makes it so it can not be resized
        panel.setLayout(null);
        frame.setSize(360, 300);

        JLabel label = new JLabel("Duper Mart tell us what you bought today: ");
        // creates interface to input product quantities
        item1 = new JTextField();
        item1.setBounds(120, 40, 165, 25);
        panel.add(item1);

        // creates interface to input product quantities
        item2 = new JTextField();
        item2.setBounds(120, 90, 165, 25);
        panel.add(item2);

        // creates interface to input product quantities
        item3 = new JTextField();
        item3.setBounds(120, 140, 165, 25);
        panel.add(item3);

        // creates text identifier for product quantity
        itemone = new JLabel("Soda $5,00");
        itemone.setBounds(10, 40, 200, 25);
        panel.add(itemone);
        // creates text identifier for product quantity
        itemtwo = new JLabel("Soup $9,00");
        itemtwo.setBounds(10, 90, 200, 25);
        panel.add(itemtwo);
        // creates text identifier for product quantity
        itemthree = new JLabel("Tomato $7,00");
        itemthree.setBounds(10, 140, 200, 25);
        panel.add(itemthree);

        // creates welcome text
        welcome = new JLabel("Duper Mart tell us what you bought today:");
        welcome.setBounds(0, 0, 600, 25);
        panel.add(welcome);

        frame.add(label);
        frame.setIconImage(image.getImage());// takes element created image and adds to logo icon 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Makes it so it closes on 'X'

    }
}
