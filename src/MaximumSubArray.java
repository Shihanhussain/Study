import java.util.Arrays;

public class MaximumSubArray {
    public static void main(String[] args) {

        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        Result result = findMaxSubarraySum(nums);
        System.out.println("Maximum Subarray Sum: " + result.maxSum);
        System.out.println("Subarray: " + Arrays.toString(Arrays.copyOfRange(nums, result.start, result.end + 1)));
    }

    public static Result findMaxSubarraySum(int[] nums) {
        int maxSum = nums[0];
        int currentSum = nums[0];
        int start = 0, tempStart = 0, end = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > currentSum + nums[i]) {
                int temp = currentSum + nums[i];
                currentSum = nums[i];
                tempStart = i;
            } else {
                currentSum += nums[i];
                int temp = currentSum + nums[i];
            }

            if (currentSum > maxSum) {
                maxSum = currentSum;
                start = tempStart;
                end = i;
            }
        }

        return new Result(maxSum, start, end);
    }
}

class Result {
    int maxSum;
    int start;
    int end;

    Result(int maxSum, int start, int end) {
        this.maxSum = maxSum;
        this.start = start;
        this.end = end;
    }
}
