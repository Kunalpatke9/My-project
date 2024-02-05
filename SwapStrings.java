public class SwapStrings {

    public static void main(String[] args) {
        // Sample strings
        String str1 = "Hello";
        String str2 = "World";

        // Swap the strings and display the result
        swapStrings(str1, str2);

        System.out.println("After Swapping:");
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);
    }

    private static void swapStrings(String str1, String str2) {
        System.out.println("Before Swapping:");
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);

        // Swap the strings using a temporary variable
        String temp = str1;
        str1 = str2;
        str2 = temp;
    }
}
