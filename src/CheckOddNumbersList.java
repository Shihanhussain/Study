import java.util.List;

public class CheckOddNumbersList {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 5, 7, 9);
        boolean allOdd = numbers.stream().allMatch(number -> number % 2 != 0);
        System.out.println("All numbers are odd: " + allOdd);
    }
}
