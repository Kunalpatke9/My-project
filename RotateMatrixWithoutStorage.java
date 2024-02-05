public class RotateMatrixWithoutStorage {

    public static void main(String[] args) {
        // Sample matrix
        int[][] matrix = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        // Rotate the matrix in-place and display the result
        rotateMatrixInPlace(matrix);

        System.out.println("Original Matrix:");
        printMatrix(matrix);
    }

    private static void rotateMatrixInPlace(int[][] matrix) {
        int size = matrix.length;

        // Transpose the matrix (swap rows with columns)
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                // Swap matrix[i][j] with matrix[j][i]
                matrix[i][j] = matrix[i][j] ^ matrix[j][i];
                matrix[j][i] = matrix[i][j] ^ matrix[j][i];
                matrix[i][j] = matrix[i][j] ^ matrix[j][i];
            }
        }

        // Reverse each row to complete the rotation
        for (int i = 0; i < size; i++) {
            int start = 0;
            int end = size - 1;
            while (start < end) {
                // Swap matrix[i][start] with matrix[i][end]
                matrix[i][start] = matrix[i][start] ^ matrix[i][end];
                matrix[i][end] = matrix[i][start] ^ matrix[i][end];
                matrix[i][start] = matrix[i][start] ^ matrix[i][end];
                start++;
                end--;
            }
        }
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
