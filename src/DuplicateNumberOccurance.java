import java.util.Arrays;
import java.util.stream.Collectors;

public class DuplicateNumberOccurance {

    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 3, 4, 4, 5};
        findDuplicateOccurrences(arr);
    }

    private static void findDuplicateOccurrences(int[] arr) {
        Arrays.stream(arr)
                .boxed()
                .collect(Collectors.groupingBy(num -> num, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 1)
                .forEach(entry -> System.out.println("Duplicate number: " + entry.getKey()));
    }
}
