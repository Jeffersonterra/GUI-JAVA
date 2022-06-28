import javax.swing.*;
class GUI2{
      public static void main(String args[]){
           JFrame frame = new JFrame("Election");
           frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           frame.setSize(300,300);
          JButton button1 = new JButton("Vote yes");
          JButton button2 = new JButton("Vote no");
          frame.getContentPane().add(button1);
          frame.getContentPane().add(button2);
          frame.setVisible(true);
     }
}
