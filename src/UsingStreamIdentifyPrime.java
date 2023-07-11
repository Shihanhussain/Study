import java.util.stream.IntStream;

public class UsingStreamIdentifyPrime {

    public static void main(String[] args) {
        int number = 37;

        boolean isPrime = isPrime(number);

        System.out.println("Is " + number + " prime? " + isPrime);
    }

    // Function to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        return !IntStream.rangeClosed(2, (int) Math.sqrt(num))
                .anyMatch(i -> num % i == 0);
    }
}
