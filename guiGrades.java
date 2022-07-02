package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class guiGrades implements ActionListener {
    private static JTextField gradeOne;
    private static JTextField gradeTwo;
    private static JTextField gradeThree;
    private static JTextField gradeFour;
    private static JButton button;

    private static JLabel passFail;

    public static void main(String[] args) {
        JFrame frame = new JFrame();// creates frame and can name frame
        JPanel panel = new JPanel();
        gradeOne = new JTextField();
        ImageIcon image = new ImageIcon("logo.jnlp");// not working properly
        frame.setSize(600, 600);
        JLabel label = new JLabel("Grades will be calculated and Students for all students");
        frame.add(label);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// makes it so it closes after clicking x
        // can also do nothing or just hide

        // creates point that prints if student has passed or not
        passFail = new JLabel("");
        passFail.setBounds(400, 0, 100, 25);
        panel.add(passFail);

        frame.setVisible(true);// makes frame visible
        frame.setTitle("Grades");// sets title
        frame.add(panel);
        frame.setResizable(false);// makes it so it can not be resized
        panel.setLayout(null);

        // sets label
        label.setBounds(0, 0, 260, 25);
        label.setIcon(image);// not working properly

        // creates interface to input math variables in the string
        gradeOne = new JTextField();
        gradeOne.setBounds(250, 50, 165, 25);
        panel.add(gradeOne);

        // creates second interface to input math variables in the string
        gradeTwo = new JTextField();
        gradeTwo.setBounds(250, 100, 165, 25);
        panel.add(gradeTwo);

        // creates third interface to input math variables in the string
        gradeThree = new JTextField();
        gradeThree.setBounds(250, 150, 165, 25);
        panel.add(gradeThree);

        // creates fourth interface to input math variables in the string
        gradeFour = new JTextField();
        gradeFour.setBounds(250, 200, 165, 25);
        panel.add(gradeFour);

        // creates button icon for calculations
        button = new JButton("Calculate");
        button.setBounds(10, 80, 120, 25);
        panel.add(button);

        // Generates action for the button to calculate
        button.addActionListener(new guiGrades());
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String math = gradeOne.getText();
        String mathtwo = gradeTwo.getText();
        String maththree = gradeThree.getText();
        String mathFour = gradeFour.getText();

        double onegrade = Double.valueOf(math);
        double twograde = Double.valueOf(mathtwo);
        double threegrade = Double.valueOf(maththree);
        double fourgrade = Double.valueOf(mathFour);

        double Average = (onegrade + twograde + threegrade + fourgrade) / 4;

        System.out.println("Grade one: " + onegrade);
        System.out.println("Grade two: " + twograde);
        System.out.println("Grade three: " + threegrade);
        System.out.println("Grade four: " + fourgrade);
        System.out.println("Avarege : " + Average);
        if (Average >= 7) {
            passFail.setText("PASSED");

        } else {
            passFail.setText("FAILED");
        }
    }
}
