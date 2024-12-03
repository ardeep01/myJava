import javax.swing.*;
  public class javax{
   public static void main(String[] args) {

     String input = JOptionPane.showInputDialog("Enter number");
     int number = java.lang.Integer.parseInt(input);
     int square = number * number;

     System.out.println("square:" + square);

     JOptionPane.showMessageDialog(null, "square:"+ square);
     System.exit(0);
   }
  }
    

