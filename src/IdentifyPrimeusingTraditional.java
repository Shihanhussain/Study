import java.util.stream.IntStream;

public class IdentifyPrimeusingTraditional {

    public static void main(String[] args) {
        int number = 37;

        boolean isPrime = isPrime(number);

        System.out.println("Is " + number + " prime? " + isPrime);
    }
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0){
                return false;
            }
        }

        return true;
    }
}
