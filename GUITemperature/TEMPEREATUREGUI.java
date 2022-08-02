package GUITemperature;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class TEMPEREATUREGUI implements ActionListener {

    private static JTextField temp;
    private static JButton button;

    public static void main(String[] args) {
        JFrame frame = new JFrame();// creates frame and can name frame
        JPanel panel = new JPanel();
        ImageIcon image = new ImageIcon("C:/Users/jefferson/Documents/GitHub/myCode/GUI/celcius.png");// not working
        frame.setVisible(true);// makes frame visible
        frame.setTitle("Tempereture");// sets title
        frame.add(panel);
        frame.setResizable(false);// makes it so it can not be resized
        panel.setLayout(null);

        // properly
        frame.setSize(600, 600);
        JLabel label = new JLabel("Calcuator will convert celcius to fahrenheit: ");
        // creates third interface to input math variables in the string
        temp = new JTextField();
        temp.setBounds(250, 150, 165, 25);
        panel.add(temp);

        // creates button icon for calculations
        button = new JButton("Calculate");
        button.setBounds(10, 80, 120, 25);
        panel.add(button);

        // JLabel labeltwo = new JLabel();

        frame.add(label);
        frame.setIconImage(image.getImage());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// makes
                                                             // it so
                                                             // it
                                                             // closes
                                                             // after
                                                             // clicking
                                                             // x
        // can also do nothing or just hide
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String temperature = temp.getText();

        double TemperatureC = Double.valueOf(temperature);

        System.out.println("Temperature is: " + TemperatureC);

    }
}
