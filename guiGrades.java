package GUI;

import javax.swing.JFrame;

import javax.swing.ImageIcon;

import javax.swing.JPanel;

public class guiGrades {
    public static void main(String[] args) {
        JFrame frame = new JFrame();// creates frame and can name frame
        JPanel panel = new JPanel();
        frame.setSize(600, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// makes it so it closes after clicking x
                                                             // can also do nothing or just hide
        frame.setVisible(true);// makes frame visible
        frame.setTitle("Grades");// sets title
        frame.add(panel);
        frame.setResizable(false);// makes it so it can not be resized
        panel.setLayout(null);
        ImageIcon image = new ImageIcon("logo.png");// Creates icon logo
        frame.setIconImage(image.getImage());// Sets icon logo

    }
}
