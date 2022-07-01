

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class GUIRecatanglecalc implements ActionListener {

    private static JLabel userlabel;
    private static JButton button;


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

        //creates button icon for calculations
        button = new JButton("Calculate");
        button.setBounds(10, 80, 80, 25);
        panel.add(button);

        // Generates action for the button
        button.addActionListener(new vote());
    }
}
