package GUIMART;



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class market implements ActionListener {

    private static JLabel welcome;
    private static JTextField item1;
    private static JTextField item2;
    private static JTextField item3;
    private static JTextField item4;
    private static JTextField item5;
    private static JTextField item6;
    private static JTextField item7;
    private static JLabel itemone;
    private static JLabel itemtwo;
    private static JLabel itemthree;
    private static JLabel itemfour;
    private static JLabel itemfive;
    private static JLabel itemsix;
    private static JLabel itemseven;
    private static JButton button;

    public static void main(String args[]) {
        JFrame frame = new JFrame();// Creates frame and can name frame
        JPanel panel = new JPanel();
        ImageIcon image = new ImageIcon("C:/Users/jefferson/Documents/GitHub/myCode/GUI/super.png");
        frame.setVisible(true);// makes frame visible
        frame.setTitle("Super DuppperMart");// Sets title to frame
        frame.add(panel);
        frame.setResizable(true);// Makes it so it can be resized
        panel.setLayout(null);
        frame.setSize(450, 600);

        JLabel label = new JLabel("Duper Mart tell us what you bought today: ");
        // creates interface to input product quantities
        item1 = new JTextField();
        item1.setBounds(120, 40, 165, 25);
        panel.add(item1);

        // creates interface to input product quantities
        item2 = new JTextField();
        item2.setBounds(120, 90, 165, 25);
        panel.add(item2);

        // creates interface to input product quantities
        item3 = new JTextField();
        item3.setBounds(120, 140, 165, 25);
        panel.add(item3);

        // creates interface to input product quantities
        item4 = new JTextField();
        item4.setBounds(120, 190, 165, 25);
        panel.add(item4);

        // creates interface to input product quantities
        item5 = new JTextField();
        item5.setBounds(120, 240, 165, 25);
        panel.add(item5);

        // creates interface to input product quantities
        item6 = new JTextField();
        item6.setBounds(120, 290, 165, 25);
        panel.add(item6);

        // creates interface to input product quantities
        item7 = new JTextField();
        item7.setBounds(120, 340, 165, 25);
        panel.add(item7);

        // creates text identifier for product quantity
        itemone = new JLabel("Soda $5,00");
        itemone.setBounds(10, 40, 200, 25);
        panel.add(itemone);

        // creates text identifier for product quantity
        itemtwo = new JLabel("Soup $9,00");
        itemtwo.setBounds(10, 90, 200, 25);
        panel.add(itemtwo);

        // creates text identifier for product quantity
        itemthree = new JLabel("Tomato $7,00");
        itemthree.setBounds(10, 140, 200, 25);
        panel.add(itemthree);

        // creates text identifier for product quantity
        itemfour = new JLabel("Water $1,00");
        itemfour.setBounds(10, 190, 200, 25);
        panel.add(itemfour);

        // creates text identifier for product quantity
        itemfive = new JLabel("Candy $0,75");
        itemfive.setBounds(10, 240, 200, 25);
        panel.add(itemfive);

        // creates text identifier for product quantity
        itemsix = new JLabel("Salad $11,00");
        itemsix.setBounds(10, 290, 200, 25);
        panel.add(itemsix);

        // creates text identifier for product quantity
        itemseven = new JLabel("Chips $5,50");
        itemseven.setBounds(10, 340, 200, 25);
        panel.add(itemseven);

        // creates welcome text
        welcome = new JLabel("Super Duper Mart tell us what you bought today:");
        welcome.setBounds(0, 0, 600, 25);
        panel.add(welcome);

        frame.add(label);
        frame.setIconImage(image.getImage());// takes element created image and adds to logo icon
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Makes it so it closes on 'X'

        // Creates button icon for calculations
        // Implements calcilation by override
        button = new JButton("Calculate");
        button.setBounds(50, 380, 120, 25);
        panel.add(button);
        button.addActionListener(new market());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String totalOneString = item1.getText();
        double totalOneDouble = Double.valueOf(totalOneString);

        String totalTwoString = item2.getText();
        double totalTwoDouble = Double.valueOf(totalTwoString);

        String totalThreeString = item3.getText();
        double totalThreeDouble = Double.valueOf(totalThreeString);

        String totalFourString = item4.getText();
        double totalFourDouble = Double.valueOf(totalFourString);

        String totalFiveString = item5.getText();
        double totalFiveDouble = Double.valueOf(totalFiveString);

        String totalSixString = item6.getText();
        double totalSixDouble = Double.valueOf(totalSixString);

        String totalSevenString = item7.getText();
        double totalSevenDouble = Double.valueOf(totalSevenString);

        System.out.println("Test: " + totalOneDouble);
        System.out.println("Test: " + totalTwoDouble);
        System.out.println("Test: " + totalThreeDouble);
        System.out.println("Test: " + totalFourDouble);
        System.out.println("Test: " + totalFiveDouble);
        System.out.println("Test: " + totalSixDouble);
        System.out.println("Test: " + totalSevenDouble);
    }
}
