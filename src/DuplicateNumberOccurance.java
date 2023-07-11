public class DuplicateNumberOccurance {

    public static void main(String[] args) {

        int a = 1233445;
        int b = 3;

        int count  = 0;

        while (a!=0){
            int digit = a%10;
            if(digit == b){
                count++;
            }
            a=a/10;
        }
        System.out.println("Number of occurrences of digit " + b + ": " + count);

    }
}
