import java.util.Arrays;
import java.util.Random;

public class TwoSum {

    public static void main(String[] args) {

        Random random = new Random();

        // Generate random array of integers
        int[] nums = random.ints(10, 1, 20).toArray(); // Array of size 10 with values between 1 and 20
        int target = random.nextInt(30) + 1; // Random target between 1 and 30
        System.out.println("Generated Array: " + Arrays.toString(nums));
        System.out.println("Target: " + target);
        int[] result = new TwoSum().twoSum(nums, target);
        System.out.println("Indices of numbers that add up to target: " + Arrays.toString(result));
    }

    public int[] twoSum(int[] nums, int target) {

        for(int i = 0; i < nums.length; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target) {
                    return new int[] {i, j};
                }
            }
        }

        return nums;
    }
}
