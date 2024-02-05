public class RotateMatrix {

    public static void main(String[] args) {
        // Sample matrix
        int[][] matrix = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        // Rotate the matrix and display the result
        int[][] rotatedMatrix = rotateMatrix(matrix);

        System.out.println("Original Matrix:");
        printMatrix(matrix);

        System.out.println("Rotated Matrix (90 degrees clockwise):");
        printMatrix(rotatedMatrix);
    }

    private static int[][] rotateMatrix(int[][] matrix) {
        int size = matrix.length;

        // Transpose the matrix (swap rows with columns)
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // Reverse each row to complete the rotation
        for (int i = 0; i < size; i++) {
            int start = 0;
            int end = size - 1;
            while (start < end) {
                int temp = matrix[i][start];
                matrix[i][start] = matrix[i][end];
                matrix[i][end] = temp;
                start++;
                end--;
            }
        }

        return matrix;
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
