public class TenSeparatedByTabs {

    public static void main(String[] args) {
        // Print numbers from 1 to 10 separated by tabs
        printNumbersSeparatedByTabs();
    }

    private static void printNumbersSeparatedByTabs() {
        for (int i = 1; i <= 10; i++) {
            System.out.print(i);

            // Print a tab except for the last number
            if (i < 10) {
                System.out.print("\t");
            }
        }

        // Add a newline character at the end
        System.out.println();
    }
}
