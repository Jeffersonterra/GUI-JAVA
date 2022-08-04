package GUIMART;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class market {
    public static void main(String args[]) {
        JFrame frame = new JFrame();// creates frame and can name frame
        JPanel panel = new JPanel();
        ImageIcon image = new ImageIcon("C:/Users/jefferson/Documents/GitHub/myCode/GUI/celcius.png");
        frame.setVisible(true);// makes frame visible
        frame.setTitle("Super DuppperMart");// sets title
        frame.add(panel);
        frame.setResizable(true);// makes it so it can not be resized
        panel.setLayout(null);
    }
}
