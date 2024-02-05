public class StringReverseUsingSplit {

    public static void main(String[] args) {
        // Sample string
        String inputString = "Hello, World!";

        // Reverse the string using split method and display the result
        String reversedString = reverseString(inputString);

        System.out.println("Original String: " + inputString);
        System.out.println("Reversed String: " + reversedString);
    }

    private static String reverseString(String inputString) {
        // Split the string into an array of words
        String[] words = inputString.split("\\s+");

        // Reverse each word and concatenate them to form the reversed string
        StringBuilder reversedStringBuilder = new StringBuilder();
        for (String word : words) {
            String reversedWord = reverseWord(word);
            reversedStringBuilder.append(reversedWord).append(" ");
        }

        // Remove trailing whitespace and return the reversed string
        return reversedStringBuilder.toString().trim();
    }

    private static String reverseWord(String word) {
        char[] charArray = word.toCharArray();
        int start = 0;
        int end = charArray.length - 1;

        while (start < end) {
            // Swap characters at start and end indices
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;

            // Move indices towards each other
            start++;
            end--;
        }

        return new String(charArray);
    }
}
