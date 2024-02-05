public class FindAllSubStrings {

    public static void main(String[] args) {
        // Sample string
        String inputString = "abc";

        // Find and display all substrings
        findAllSubStrings(inputString);
    }

    private static void findAllSubStrings(String inputString) {
        int length = inputString.length();

        System.out.println("All Substrings of \"" + inputString + "\":");

        // Generate and print all substrings
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j <= length; j++) {
                String substring = inputString.substring(i, j);
                System.out.println(substring);
            }
        }
    }
}
