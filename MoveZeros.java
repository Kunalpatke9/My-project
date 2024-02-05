public class MoveZeros {

    public static void main(String[] args) {
        // Sample array
        int[] array = { 0, 2, 0, 3, 4, 0, 5, 0 };

        // Move zeros to the end and display the result
        moveZeros(array);

        System.out.println("Array with Zeros Moved to the End:");
        printArray(array);
    }

    private static void moveZeros(int[] array) {
        int nonZeroIndex = 0;

        // Traverse the array and move non-zero elements to the front
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                // Swap non-zero element with the element at nonZeroIndex
                int temp = array[i];
                array[i] = array[nonZeroIndex];
                array[nonZeroIndex] = temp;

                // Move nonZeroIndex to the next position
                nonZeroIndex++;
            }
        }
    }

    private static void printArray(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
