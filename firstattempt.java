
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


frame.setVisible(true);// always needed at the end

	}


	}

