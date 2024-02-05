public class MatrixTranspose {

    public static void main(String[] args) {
        // Sample matrix
        int[][] matrix = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        // Find and display the transpose of the matrix
        int[][] transposeMatrix = transpose(matrix);
        displayMatrix(transposeMatrix);
    }

    private static int[][] transpose(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;

        int[][] transposeMatrix = new int[columns][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                transposeMatrix[j][i] = matrix[i][j];
            }
        }

        return transposeMatrix;
    }

    private static void displayMatrix(int[][] matrix) {
        System.out.println("Original Matrix:");
        printMatrix(matrix);

        System.out.println("Transpose Matrix:");
        printMatrix(transpose(matrix));
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
