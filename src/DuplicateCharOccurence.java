import java.util.HashMap;
import java.util.Map;

public class DuplicateCharOccurence {

    public static void main(String[] args) {
        String s = "sssasas";

        Map<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        System.out.println("Duplicate occurrences of characters:");
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }

    }
}
