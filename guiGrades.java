package GUI;

import javax.swing.JFrame;

import java.awt.Color;
import javax.swing.*;

import javax.swing.ImageIcon;

import javax.swing.JPanel;

import javax.swing.JLabel;

public class guiGrades {
    private static JTextField gradeone;
    private static JTextField gradeTwo;
    private static JTextField gradeThree;
    private static JTextField GradeFour;

    public static void main(String[] args) {
        JFrame frame = new JFrame();// creates frame and can name frame
        JPanel panel = new JPanel();
        gradeone = new JTextField();
        ImageIcon image = new ImageIcon("logo.jnlp");// not working properly
        JLabel label = new JLabel("Grades will be calculated and Students for all students");
        label.setIcon(image);// not working properly
        frame.setSize(600, 600);
        frame.add(label);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// makes it so it closes after clicking x
                                                             // can also do nothing or just hide
        frame.setVisible(true);// makes frame visible
        frame.setTitle("Grades");// sets title
        frame.add(panel);
        frame.setResizable(false);// makes it so it can not be resized
        panel.setLayout(null);

        // creates second interface to input math variables in the string
        gradeone = new JTextField();
        gradeone.setBounds(250, 50, 165, 25);
        panel.add(gradeone);

        // creates second interface to input math variables in the string
        gradeTwo = new JTextField();
        gradeTwo.setBounds(250, 100, 165, 25);
        panel.add(gradeTwo);

        // creates second interface to input math variables in the string
        gradeThree = new JTextField();
        gradeThree.setBounds(250, 150, 165, 25);
        panel.add(gradeThree);

        // creates second interface to input math variables in the string
        GradeFour = new JTextField();
        GradeFour.setBounds(250, 200, 165, 25);
        panel.add(GradeFour);

    }
}
