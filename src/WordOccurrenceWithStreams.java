import java.util.*;
import java.util.stream.Collectors;

public class WordOccurrenceWithStreams {
    public static void main(String[] args) {
        String s = "my name is Shihan";

        Map<String, Long> wordCount = Arrays.stream(s.toLowerCase().split(" "))
            .collect(Collectors.groupingBy(word -> word, Collectors.counting()));

        // Print the result
        wordCount.forEach((word, count) -> System.out.println(word + " : " + count));
    }
}