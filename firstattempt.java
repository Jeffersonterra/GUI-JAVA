
 import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;//10

import javax.swing.*;

public class firstattempt  {
//implements imports and generates method at 10
	//parado aos 15 minutos do video
	public static void main(String[] args) {
		// gera o JFRAME 1
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
frame.setSize(100, 100);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setVisible(true);
frame.add(panel);
panel.setLayout(null);
		
//creates the user icon name 2
JLabel userlabel = new JLabel("User");
userlabel.setBounds(10, 20 , 80, 25);
panel.add(userlabel);
		
//Jtext field creates the text field 3
JTextField userText = new JTextField();
userText.setBounds(100, 20, 165, 25);
panel.add(userText);

//parte que diz password 4
JLabel passwordLabel = new JLabel("Password");
passwordLabel.setBounds (10, 50 , 80 ,25);
panel.add(passwordLabel);
		
//password text field 5
JPasswordField passwordText = new JPasswordField();
passwordText.setBounds(100, 50, 165, 25);
panel.add(passwordText);

		
// adds button 6
JButton button = new JButton("Login");
button.setBounds(10,80, 80 ,25);
panel.add(button);

button.addActionListener(new firstattempt());
JLabel success = new JLabel("");
success.setBounds(10, 110 , 300 , 25);
panel.add(success);// Just message at entering 7

		


frame.setVisible(true);// always needed at the end

	}

}
	


