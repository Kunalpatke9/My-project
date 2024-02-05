public class SquareOfArray {

    public static void main(String[] args) {
        // Sample array
        int[] array = { 1, 2, 3, 4, 5 };

        // Square each element and display the result
        int[] squaredArray = squareArray(array);

        System.out.println("Original Array:");
        printArray(array);

        System.out.println("Squared Array:");
        printArray(squaredArray);
    }

    private static int[] squareArray(int[] array) {
        int length = array.length;
        int[] squaredArray = new int[length];

        for (int i = 0; i < length; i++) {
            squaredArray[i] = array[i] * array[i];
        }

        return squaredArray;
    }

    private static void printArray(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
