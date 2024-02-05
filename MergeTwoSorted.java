public class MergeTwoSorted {

    public static void main(String[] args) {
        // Sample sorted arrays
        int[] array1 = { 1, 3, 5, 7 };
        int[] array2 = { 2, 4, 6, 8 };

        // Merge the two arrays and display the result
        int[] mergedArray = mergeSortedArrays(array1, array2);

        System.out.println("Merged Sorted Array:");
        printArray(mergedArray);
    }

    private static int[] mergeSortedArrays(int[] array1, int[] array2) {
        int size1 = array1.length;
        int size2 = array2.length;

        int[] mergedArray = new int[size1 + size2];

        // Merge the two sorted arrays
        int i = 0, j = 0, k = 0;
        while (i < size1 && j < size2) {
            if (array1[i] <= array2[j]) {
                mergedArray[k] = array1[i];
                i++;
            } else {
                mergedArray[k] = array2[j];
                j++;
            }
            k++;
        }

        // Copy the remaining elements from both arrays, if any
        while (i < size1) {
            mergedArray[k] = array1[i];
            i++;
            k++;
        }

        while (j < size2) {
            mergedArray[k] = array2[j];
            j++;
            k++;
        }

        return mergedArray;
    }

    private static void printArray(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
