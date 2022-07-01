import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class GUIRecatanglecalc implements ActionListener {
    private static JTextField mathText;
    private static JTextField mathtwoText;

    private static JLabel userlabel;
    private static JButton button;
    int countyes = 0;

    public static void main(String[] args) {

        // generates JFrame
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        frame.setSize(100, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.add(panel);
        panel.setLayout(null);

        // creates info icon
        userlabel = new JLabel("Tell us your vote (only yes or no)");
        userlabel.setBounds(10, 20, 220, 25);
        panel.add(userlabel);

        // creates interface to input math variables in the string
        mathText = new JTextField();
        mathText.setBounds(200, 20, 165, 25);
        panel.add(mathText);

        // creates second interface to input math variables in the string
        mathtwoText = new JTextField();
        mathtwoText.setBounds(200, 50, 165, 25);
        panel.add(mathtwoText);

        // creates button icon for calculations
        button = new JButton("Calculate");
        button.setBounds(10, 80, 120, 25);
        panel.add(button);

        // Generates action for the button new method has to contain original method
        // name
        button.addActionListener(new GUIRecatanglecalc());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Yes: " + countyes);
        countyes++; // Used only to test if it is working properly
    }
}
