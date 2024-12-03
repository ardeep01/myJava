import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteToFiles {
    public static void main(String[] args) {
        // Scanner object to accept input from the user
        Scanner scanner = new Scanner(System.in);
        // Specify the file where the contents will be stored
        String filePath = "./output.txt";  // You can change this to your desired path
        System.out.println("Enter text to be written to the file (type 'exit' to finish):");

        // Try-with-resources block to ensure the FileWriter is closed automatically
        try (FileWriter writer = new FileWriter(filePath)) {
            while (true) {
                // Read input from the user
                String userInput = scanner.nextLine();

                // Break the loop if the user types "exit"
                if (userInput.equalsIgnoreCase("exit")) {
                    break;
                }

                // Write the input to the file followed by a newline
                writer.write(userInput + System.lineSeparator());
            }

            System.out.println("The content has been successfully written to the file: " + filePath);
        } catch (IOException e) {
            // Handle any I/O exceptions
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
        finally{
            System.out.println("Name :Ardeep Kaur , Roll No : 226956");
        }

        // Close the scanner
        scanner.close();
    }
}