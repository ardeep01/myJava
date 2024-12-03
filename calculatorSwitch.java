//Program to show the use of switch statement in terms of conditional branching.
import javax.swing.*;
public class calculatorSwitch {
    public static void main(String args[]){
       String input1=JOptionPane.showInputDialog("Enter op1:");  // taking input1(string)
       int op1=java.lang.Integer.parseInt(input1);                       // parsing input1 to int op1
       String input2=JOptionPane.showInputDialog("Enter op2:");
       int op2=java.lang.Integer.parseInt(input2);                       // same for op2
       String choice=JOptionPane.showInputDialog("Enter your choice:");
       int ch=java.lang.Integer.parseInt(choice);                        
    
    switch(ch){
        case 1:
        int sum=op1+op2;
        JOptionPane.showMessageDialog(null,"sum is:"+sum);
        break;
        
        case 2:
        int sub=op1-op2;
        JOptionPane.showMessageDialog(null,"diff is:"+sub);
        break;

        case 3:
        int mul=op1*op2;
        JOptionPane.showMessageDialog(null,"mul is:"+mul);
        break;

        case 4:
        int div=op1/op2;
        JOptionPane.showMessageDialog(null,"div is:"+div);
        break;

        default:
        System.out.println("WRONG CHOICE!");
        
    }
    }
}




