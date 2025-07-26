import java.util.Map;
import java.util.stream.Collectors;

public class CountCharacters {

    public static void main(String[] args) {
        String input = "Hello World!";
        Map<Character,Long> charCountMap = input.chars().filter(c->!Character.isWhitespace(c) && Character.isAlphabetic(c)).mapToObj(c-> (char) Character.toLowerCase(c))
                .sorted().collect(Collectors.groupingBy(c1-> c1, Collectors.counting()));
        System.out.println(charCountMap);


    }
}
