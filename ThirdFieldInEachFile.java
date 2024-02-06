package array.assignment;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ThirdFieldInEachFile {

    public static void main(String[] args) {
        // Specify the file paths
        String[] filePaths = { "file1.txt", "file2.txt", "file3.txt" };

        // Iterate through each file and print the third field in each line
        for (String filePath : filePaths) {
            System.out.println("File: " + filePath);
            printThirdField(filePath);
            System.out.println();
        }
    }

    private static void printThirdField(String filePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;

            while ((line = reader.readLine()) != null) {
                // Split the line into fields based on a delimiter (e.g., space)
                String[] fields = line.split("\\s+");

                // Print the third field if it exists
                if (fields.length >= 3) {
                    System.out.println("Third Field: " + fields[2]);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
