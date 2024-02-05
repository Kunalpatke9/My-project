public class EquilibriumPointInArray {

    public static void main(String[] args) {
        // Sample array
        int[] array = { 1, 7, 3, 6, 5, 6 };

        // Find and display the equilibrium point
        int equilibriumPoint = findEquilibriumPoint(array);
        System.out.println("Equilibrium Point: " + equilibriumPoint);
    }

    private static int findEquilibriumPoint(int[] array) {
        int totalSum = 0;
        int leftSum = 0;

        // Calculate the total sum of the array
        for (int element : array) {
            totalSum += element;
        }

        // Iterate through the array to find the equilibrium point
        for (int i = 0; i < array.length; i++) {
            // Subtract the current element from the total sum to get the right sum
            totalSum -= array[i];

            // Check if the left sum is equal to the right sum
            if (leftSum == totalSum) {
                return i; // Equilibrium point found at index i
            }

            // Add the current element to the left sum for the next iteration
            leftSum += array[i];
        }

        // If no equilibrium point is found, return -1
        return -1;
    }
}
