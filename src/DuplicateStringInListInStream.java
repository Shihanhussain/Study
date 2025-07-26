import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DuplicateStringInListInStream {

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("apple");
        strings.add("banana");
        strings.add("apple");
        strings.add("orange");
        strings.add("banana");
        strings.add("apple");

        Map<String, Long> duplicateCountMap = strings.stream()
                .collect(Collectors.groupingBy(str -> str, Collectors.counting()));

        // Iterate over the map entries to print the duplicate strings with their counts
        duplicateCountMap.entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .forEach(entry -> System.out.println("String: " + entry.getKey() + ", Count: " + entry.getValue()));

        duplicateCountMap.forEach((String,Long) -> {
            if (Long > 1) {
                System.out.println("String: " + String + ", Count: " + Long);
            }
        });
    }
}
