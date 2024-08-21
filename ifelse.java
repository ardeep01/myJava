package myJava;

import javax.swing.*;
    public class ifelse {
        public static void main(String args[]){
        String input1=JOptionPane.showInputDialog("Enter num1:");
        int num1 = Integer.parseInt(input1);
        String input2=JOptionPane.showInputDialog("Enter num2:");
        int num2 = Integer.parseInt(input2);
        
        if(num1>num2){
            JOptionPane.showMessageDialog(null,"Number1 is graeter than Number2");
        }
        else if(num1==num2){
            JOptionPane.showMessageDialog(null,"Number1 is equal to Number2");
        }
        else{
            JOptionPane.showMessageDialog(null,"Number1 is lesser than Number2");
        }
    }
    }
    

