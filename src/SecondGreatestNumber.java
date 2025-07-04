public class SecondGreatestNumber {

    public static void main(String[] args){

        int[] arr = {10, 20, 4, 45, 99};
        int secondGreatest = findSecondGreatest(arr);
        System.out.println("The second greatest number is: " + secondGreatest);
    }

    private static int findSecondGreatest(int[] arr) {
        if (arr.length < 2) {
            throw new IllegalArgumentException("Array must contain at least two elements.");
        }

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > first) {
                second = first;
                first = num;
            } else if (num > second && num != first) {
                second = num;
            }
        }

        if (second == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("There is no second greatest number.");
        }

        return second;
    }
}
