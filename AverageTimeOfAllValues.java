public class AverageTimeOfAllValues {

    public static void main(String[] args) {
        // Sample array of values
        double[] values = { 10.5, 20.3, 15.7, 8.2, 12.1 };

        // Calculate and print the average of all values
        double average = calculateAverage(values);

        System.out.println("Original Values: " + java.util.Arrays.toString(values));
        System.out.println("Average: " + average);
    }

    private static double calculateAverage(double[] values) {
        if (values.length == 0) {
            return 0.0; // Handle the case where the array is empty
        }

        double sum = 0.0;

        for (double value : values) {
            sum += value;
        }

        return sum / values.length;
    }
}
