package GUII;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;//10

import javax.swing.*;

public class vote implements ActionListener {

    private static JLabel userlabel;
    private static JTextField userText;
    private static JLabel totalvotes;

    private static JButton button;

    private static JLabel success;
    int countyes = 0;
    int countno = 0;
    double total = countyes + countno;

    public static void main(String[] args) {
       
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        frame.setSize(100, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.add(panel);
        panel.setLayout(null);

        userlabel = new JLabel("Tell us your vote (only yes or no)");
        userlabel.setBounds(10, 20, 220, 25);
        panel.add(userlabel);


        userText = new JTextField();
        userText.setBounds(200, 20, 165, 25);
        panel.add(userText);
        
        totalvotes = new JLabel("Total Votes");
        totalvotes.setBounds(10, 50, 300, 25);
        panel.add(totalvotes);

        
        button = new JButton("Vote");
        button.setBounds(10, 80, 80, 25);
        panel.add(button);


        button.addActionListener(new vote());
        success = new JLabel("");
        success.setBounds(10, 110, 300, 25);
        panel.add(success);// Just message at entering 7

        frame.setVisible(true);// always needed at the end

    }

     @Override
    public void actionPerformed(ActionEvent e) {
      
        String user = userText.getText();

        if (user.equals("Yes") || user.equals("yes")) {
            countyes++;

        }
        if (user.equals("No") || user.equals("no")) {
            countno++;

        }
        total = countyes + countno;
        success.setText("Vote successful!    Votes yes:  " + countyes + "   Votes no: " + countno);
        totalvotes.setText("Votes total " + total);

        System.out.println("Yes: " + countyes);

        System.out.println("No: " + countno);

    }

    

}
