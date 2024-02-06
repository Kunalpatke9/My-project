import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class AllLinesContainingString {

    public static void main(String[] args) {
        // Specify the file path and the string to search for
        String filePath = "path/to/your/textfile.txt";
        String searchString = "yourString";

        // Find and print all lines containing the specified string
        findAndPrintLines(filePath, searchString);
    }

    private static void findAndPrintLines(String filePath, String searchString) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;

            while ((line = reader.readLine()) != null) {
                if (line.contains(searchString)) {
                    System.out.println(line);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
