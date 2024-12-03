//  Show the occurrence of checked and unchecked exceptions also suggest a way to handle them .
 import java.io.*; // For demonstrating checked exceptions

 public class ExceptionExample {
     
     // This method will throw a checked exception (IOException)
     public static void readFile() throws IOException {
         // Checked Exception: FileNotFoundException is a subclass of IOException
         FileReader file = new FileReader("nonexistentfile.txt");
         BufferedReader fileInput = new BufferedReader(file);
         
         // Read and print the first line of the file
         System.out.println(fileInput.readLine());
         fileInput.close();
     }
 
     public static void main(String[] args) {
         // Handling Checked Exception (IOException)
         try {
             // Trying to read from a file that doesn't exist
             readFile();
         } catch (IOException e) {
             // Handle the checked exception (IOException)
             //System.out.println("Name : Ardeep Kaur , Roll no : 226956");
             System.out.println("Checked Exception caught: " + e);
         }
 
         // Demonstrating Unchecked Exception (ArithmeticException)
         try {
             // This will throw an ArithmeticException (divide by zero)
             int result = 10 / 0;
             System.out.println("Result " + result);
         } catch (ArithmeticException e) {
             // Handle the unchecked exception
             System.out.println("Unchecked Exception caught: " + e);
         }
 
         // Demonstrating Unchecked Exception (NullPointerException)
         try {
             // String str = null;
             // This will throw NullPointerException
             // System.out.println(str.length());
         } catch (NullPointerException e) {
             // Handle the unchecked exception
             System.out.println("Unchecked Exception caught: " + e);
         }
     }
 }