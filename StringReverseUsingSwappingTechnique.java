public class StringReverseUsingSwappingTechnique {

    public static void main(String[] args) {
        // Sample string
        String inputString = "Hello, World!";

        // Reverse the string using swapping technique and display the result
        String reversedString = reverseString(inputString);

        System.out.println("Original String: " + inputString);
        System.out.println("Reversed String: " + reversedString);
    }

    private static String reverseString(String inputString) {
        char[] charArray = inputString.toCharArray();
        int start = 0;
        int end = charArray.length - 1;

        // Swap characters at start and end indices until they meet in the middle
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
