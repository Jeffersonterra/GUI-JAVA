package GUITemperature;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class TEMPEREATUREGUI implements ActionListener {

    private static JTextField temp;
    private static JButton button;
    private static JLabel TemperatureF;
    private static JLabel tempC;

    public static void main(String[] args) {
        JFrame frame = new JFrame();// creates frame and can name frame
        JPanel panel = new JPanel();
        ImageIcon image = new ImageIcon("C:/Users/jefferson/Documents/GitHub/myCode/GUI/celcius.png");
        frame.setVisible(true);// makes frame visible
        frame.setTitle("Tempereture");// sets title
        frame.add(panel);
        frame.setResizable(true);// makes it so it can not be resized
        panel.setLayout(null);

        frame.setSize(360, 300);
        JLabel label = new JLabel("Calcuator will convert celcius to fahrenheit: ");
        // creates interface to input temperature
        temp = new JTextField();
        temp.setBounds(100, 150, 165, 25);
        panel.add(temp);

        // interface to show temperature in celcius
        tempC = new JLabel("Celcius: ");
        tempC.setBounds(10, 150, 165, 25);
        panel.add(tempC);
        // creates point that shows the temperature
        TemperatureF = new JLabel("");
        TemperatureF.setBounds(10, 0, 200, 25);
        panel.add(TemperatureF);

        // creates button icon for calculations
        button = new JButton("Calculate");
        button.setBounds(10, 80, 120, 25);
        panel.add(button);

        // JLabel labeltwo = new JLabel();

        frame.add(label);
        frame.setIconImage(image.getImage());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //makes it so it closes after clicking on "X"

        button.addActionListener(new TEMPEREATUREGUI());
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String temperature = temp.getText();

        double TemperatureC = Double.valueOf(temperature);
        double TemperatureFa = (TemperatureC * 9 / 5) + 32;

        System.out.println("Temperature is: " + TemperatureFa);

        TemperatureF.setText("Temperature Fahrenheit: " + TemperatureFa);
    }
}
