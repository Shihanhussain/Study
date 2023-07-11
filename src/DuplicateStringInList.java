import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DuplicateStringInList {

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("apple");
        strings.add("banana");
        strings.add("apple");
        strings.add("orange");
        strings.add("banana");
        strings.add("apple");

        Map<String, Integer> duplicateCountMap = new HashMap<>();

        for (String str : strings) {
            // Get the current count of the string or 0 if it doesn't exist in the map
            int count = duplicateCountMap.getOrDefault(str, 0);

            // Increment the count
            duplicateCountMap.put(str, count + 1);
        }

        // Iterate over the map entries to print the duplicate strings with their counts
        for (Map.Entry<String, Integer> entry : duplicateCountMap.entrySet()) {
            String str = entry.getKey();
            int count = entry.getValue();

            if (count > 1) {
                System.out.println("String: " + str + ", Count: " + count);
            }
        }

    }
}
