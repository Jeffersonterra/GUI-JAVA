import javax.swing.*;
class GUI2{
      public static void main(String args[]){
           JFrame frame = new JFrame("Election");
           frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           frame.setSize(300,300);
            //ADICIONA PRIMEIRO BOTAO
            JButton button1 = new JButton("Vote yes");
            button1.setBounds(10, 20 , 80, 25);
            frame.getContentPane().add(button1);
           //ADICIONA O SEGUNDO BOTAO
           JButton button2 = new JButton("Vote no");
           button2.setBounds(100, 20 , 80, 25);
           frame.getContentPane().add(button2);
            //trying to find a way to 
            // to make each button to have a 
            // diferent action
          frame.setVisible(true);
     }
}
