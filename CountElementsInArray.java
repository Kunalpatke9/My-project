import java.util.HashMap;
import java.util.Map;

public class CountElementsInArray {

    public static void main(String[] args) {
        // Sample array
        int[] array = { 1, 2, 3, 4, 2, 3, 1, 5, 6, 7, 5, 7, 8, 9, 8, 9 };

        // Count occurrences of each element
        Map<Integer, Integer> elementCountMap = countElements(array);

        // Display the results
        System.out.println("Element Counts:");
        for (Map.Entry<Integer, Integer> entry : elementCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    private static Map<Integer, Integer> countElements(int[] array) {
        Map<Integer, Integer> elementCountMap = new HashMap<>();

        for (int element : array) {
            // If the element is already in the map, increment its count
            if (elementCountMap.containsKey(element)) {
                elementCountMap.put(element, elementCountMap.get(element) + 1);
            } else {
                // If the element is not in the map, add it with a count of 1
                elementCountMap.put(element, 1);
            }
        }

        return elementCountMap;
    }
}
