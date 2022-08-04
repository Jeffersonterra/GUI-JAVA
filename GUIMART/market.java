package GUIMART;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class market {

    private static JTextField item1;

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
        // creates interface to input temperature
        item1 = new JTextField();
        item1.setBounds(100, 150, 165, 25);
        panel.add(item1);

    }
}
