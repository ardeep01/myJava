// Source code is decompiled from a .class file using FernFlower decompiler.
import java.awt.Component;
import javax.swing.Icon;
import javax.swing.JOptionPane;

public class strOperationsGUI {
   public strOperationsGUI() {
   }

   public static void main(String[] var0) {
      String var1 = JOptionPane.showInputDialog("Enter the first string:");
      String var2 = JOptionPane.showInputDialog("Enter the second string:");
      String[] var3 = new String[]{"Concatenate", "Compare", "Length", "Uppercase", "Lowercase", "Contains", "Exit"};

      while(true) {
         int var4 = JOptionPane.showOptionDialog((Component)null, "Choose an operation", "String Operations", -1, 1, (Icon)null, var3, var3[0]);
         if (var4 == 6 || var4 == -1) {
            return;
         }

         String var10000;
         String var5;
         switch (var4) {
            case 0:
               var5 = "Concatenated: " + var1 + var2;
               break;
            case 1:
               var5 = var1.equals(var2) ? "Strings are equal" : "Strings are not equal";
               break;
            case 2:
               int var6 = var1.length();
               var5 = "Length of first: " + var6 + "\nLength of second: " + var2.length();
               break;
            case 3:
               var10000 = var1.toUpperCase();
               var5 = "Uppercase:\n" + var10000 + "\n" + var2.toUpperCase();
               break;
            case 4:
               var10000 = var1.toLowerCase();
               var5 = "Lowercase:\n" + var10000 + "\n" + var2.toLowerCase();
               break;
            case 5:
               var5 = var1.contains(var2) ? "First contains second" : (var2.contains(var1) ? "Second contains first" : "Neither contains the other");
               break;
            default:
               var5 = "Invalid choice!";
         }

         JOptionPane.showMessageDialog((Component)null, var5);
      }
   }
}

