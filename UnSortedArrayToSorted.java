import java.util.Arrays;

public class UnSortedArrayToSorted {

    public static void main(String[] args) {
        // Sample unsorted array
        int[] unsortedArray = { 5, 2, 9, 1, 5, 6 };

        // Convert the unsorted array to a sorted array
        int[] sortedArray = convertToSortedArray(unsortedArray);

        // Display the result
        System.out.println("Original Unsorted Array: " + Arrays.toString(unsortedArray));
        System.out.println("Sorted Array: " + Arrays.toString(sortedArray));
    }

    private static int[] convertToSortedArray(int[] unsortedArray) {
        // Create a copy of the unsorted array
        int[] sortedArray = Arrays.copyOf(unsortedArray, unsortedArray.length);

        // Sort the array
        Arrays.sort(sortedArray);

        return sortedArray;
    }
}
