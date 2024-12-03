import javax.swing.JOptionPane;

public class simpleInputOutput {
    public static void main(String[] args) {
        // Taking input from the user using JOptionPane
        String userInput = JOptionPane.showInputDialog("Enter something:");

        // Displaying the input back to the user
        JOptionPane.showMessageDialog(null, "You entered: " + userInput);
    }
}
