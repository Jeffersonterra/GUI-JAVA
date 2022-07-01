

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;//10

import javax.swing.*;

public class vote implements ActionListener {

    private static JLabel userlabel;
    private static JTextField userText;
    private static JLabel passwordLabel;
    private static JPasswordField passwordText;
    private static JButton button;

    private static JLabel success;
    int countyes = 0;
    int countno = 0;

    // implements imports and generates method at 10
    // parado aos 15 minutos do video
    public static void main(String[] args) {
        // gera o JFRAME 1
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        frame.setSize(100, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.add(panel);
        panel.setLayout(null);

        // creates the user icon name 2
        userlabel = new JLabel("Tell us your vote (only yes or no)");
        userlabel.setBounds(10, 20, 220, 25);
        panel.add(userlabel);

        // Jtext field creates the text field 3

        userText = new JTextField();
        userText.setBounds(230, 20, 165, 25);
        panel.add(userText);
        // parte que diz password 4
        passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(10, 50, 80, 25);
        panel.add(passwordLabel);

        // password text field 5

        passwordText = new JPasswordField();
        passwordText.setBounds(100, 50, 165, 25);
        panel.add(passwordText);

        // adds button 6
        button = new JButton("Vote");
        button.setBounds(10, 80, 80, 25);
        panel.add(button);

        /* to add action to a button 9 */

        button.addActionListener(new vote());

        // Success login label message it starts with "" to show nothing but
        // indicating it is a string to be later shown
        success = new JLabel("");
        success.setBounds(10, 110, 300, 25);
        panel.add(success);// Just message at entering 7

        frame.setVisible(true);// always needed at the end

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        String user = userText.getText();
        String password = passwordText.getText();
        System.out.println(user);

        System.out.println("Yes: " + countyes);

        System.out.println("No: " + countno);

        if (user.equals("Yes") || user.equals("yes")) {
            success.setText("Vote successful! \nVotes yes:  " + countyes + "\nVotes no: " + countno);
            countyes++;

        }
        if (user.equals("No") || user.equals("no")) {
            countno++;
            success.setText("Vote successful! Votes yes:  " + countyes + "   Votes no: " + countno);
            passwordLabel.setText("Votes no" + countno);

        }

    }

}
