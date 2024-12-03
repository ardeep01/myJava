// Read and write content from a file 
import java.io.*;
public class ReadWriteToFiles{
    public static void main(String[] args) {
        // Specify the input file to read from
        String inputFilePath = "input.txt";  // File to read from
        // Specify the output file to write to
        String outputFilePath = "output.txt"; // File to write to

        // Try-with-resources block to ensure resources are closed
        try (
            BufferedReader reader = new BufferedReader(new FileReader(inputFilePath));
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath))
        ) {
            String line;
            // Reading each line from the input file
            while ((line = reader.readLine()) != null) {
                // Writing the read line to the output file
                writer.write(line);
                writer.newLine();  // Ensure each line is written separately
            }
            System.out.println("Name : Ardeep Kaur, Roll No : 226956");
            System.out.println("File reading and writing completed successfully.");
        } catch (IOException e) {
            // Handle exceptions related to file I/O
            System.out.println("An error occurred during file operations: " + e.getMessage());
        }
    }
}
