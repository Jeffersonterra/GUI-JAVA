import javax.swing.*;
class GUI2{
      public static void main(String args[]){
           JFrame frame = new JFrame("Election");
           frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           frame.setSize(300,300);
          JButton button1 = new JButton("Vote yes");
          JButton button2 = new JButton("Vote no");
            button1.setBounds(10, 20 , 80, 25);
            button2.setBounds(100, 20 , 80, 25);
          frame.getContentPane().add(button1);
          frame.getContentPane().add(button2);
          frame.setVisible(true);
     }
}
