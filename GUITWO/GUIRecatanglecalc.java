package GUITWO;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class GUIRecatanglecalc implements ActionListener {
    private static JTextField mathText;
    private static JTextField mathtwoText;
    private static JLabel result;
    private static JLabel userlabel;
    private static JButton button;
    int countyes = 0;

    public static void main(String[] args) {

        // generates JFrame
        JFrame frame = new JFrame("Area of reactangle calc");
        JPanel panel = new JPanel();

        // makes and sets icon
        ImageIcon image = new ImageIcon("math.png");// properly working now
        frame.setIconImage(image.getImage());
        
        /*For full computer directory file acess use C:/Users/jefferson/Documents/GitHub/myCode/GUI/math.png
        In the pc i am currently using its only working this way  */
        // try to allways use full directory
        frame.setSize(100, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.add(panel);
        panel.setLayout(null);

        // creates info icon
        userlabel = new JLabel("Input both sides to calculate area");
        userlabel.setBounds(10, 20, 220, 25);
        panel.add(userlabel);

        // creates interface to input math variables in the string
        mathText = new JTextField();
        mathText.setBounds(250, 20, 165, 25);
        panel.add(mathText);

        // creates second interface to input math variables in the string
        mathtwoText = new JTextField();
        mathtwoText.setBounds(250, 50, 165, 25);
        panel.add(mathtwoText);

        // creates button icon for calculations
        button = new JButton("Calculate");
        button.setBounds(10, 80, 120, 25);
        panel.add(button);

        // sets result window
        result = new JLabel("");
        result.setBounds(150, 80, 300, 25);
        panel.add(result);

        // Generates action for the button new method has to contain original method
        // name
        button.addActionListener(new GUIRecatanglecalc());
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String math = mathText.getText();
        String mathtwo = mathtwoText.getText();
        double sidea = Double.valueOf(math);
        double sideb = Double.valueOf(mathtwo);
        double area = sidea * sideb;
        System.out.println(sidea + " X " + sideb);
        System.out.println("Area: " + area);
        result.setText("The area is: " + area);

    }
}
