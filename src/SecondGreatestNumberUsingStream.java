import java.util.Arrays;

public class SecondGreatestNumberUsingStream {

    public static void main(String[] args) {
        int[] numbers = {5, 3, 8, 1, 4, 9, 2};
        int secondGreatest = findSecondGreatest(numbers);
        System.out.println("The second greatest number is: " + secondGreatest);
    }

    private static int findSecondGreatest(int[] numbers) {
        return   Arrays.stream(numbers)
                .distinct() // Remove duplicates
                .sorted() // Sort the numbers
                .skip(numbers.length - 2) // Skip to the second last element
                .findFirst() // Get the first element from the remaining stream
                .orElseThrow(() -> new IllegalArgumentException("Array must contain at least two distinct elements"));
    }
}
