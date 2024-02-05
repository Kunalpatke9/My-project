import java.util.HashSet;

public class FirstDuplicateElementInArray {

    public static void main(String[] args) {
        // Sample array
        int[] array = { 3, 2, 1, 4, 2, 5, 3 };

        // Find and display the first duplicate element
        int firstDuplicate = findFirstDuplicate(array);

        if (firstDuplicate != -1) {
            System.out.println("First Duplicate Element: " + firstDuplicate);
        } else {
            System.out.println("No duplicate element found.");
        }
    }

    private static int findFirstDuplicate(int[] array) {
        HashSet<Integer> seenSet = new HashSet<>();

        for (int element : array) {
            // If the element is already in the set, it is the first duplicate
            if (seenSet.contains(element)) {
                return element;
            }

            // Add the element to the set
            seenSet.add(element);
        }

        // If no duplicate element is found, return -1
        return -1;
    }
}
