import java.util.stream.IntStream;

public class InvertedPrintPatternStreams {

    public static void main(String[] args) {
        int rows = 5;
        IntStream.rangeClosed(1, rows).map(i -> rows - i + 1).forEach(i -> {
            String spaces = " ".repeat(rows - i);
            String stars = "*".repeat(2 * i - 1);
            System.out.println(spaces + stars);
        });
    }
}
