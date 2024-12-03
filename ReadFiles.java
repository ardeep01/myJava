//  Read Strings contained in a file and displays them on the console.
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class ReadFiles {
    public static void main(String[] args) {
        String filePath = "./input.txt";  

        // Using try-with-resources to ensure the file is closed automatically
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            // Read each line from the file and display it on the console
            while ((line = br.readLine()) != null) {
                System.out.println("-------------------------------");
                System.out.println(line);
            }
        } catch (IOException e) {
            // Handle any I/O exceptions that may occur
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }}
