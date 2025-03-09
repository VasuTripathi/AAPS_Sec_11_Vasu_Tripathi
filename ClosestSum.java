import java.util.*;

public class ClosestSum {
    public static int closestTripletSum(int[] nums, int target) {
        int n = nums.length;
        int closestSum = Integer.MAX_VALUE;
        int minDiff = Integer.MAX_VALUE;

        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    int sum = nums[i] + nums[j] + nums[k];
                    int diff = Math.abs(target - sum);

                    if (diff < minDiff) {
                        minDiff = diff;
                        closestSum = sum;
                    }
                }
            }
        }
        return closestSum;
    }

    public static void main(String[] args) {
        int[] nums = {-1, 2, 1, -4};
        int target = 1;
        System.out.println("Closest triplet sum: " + closestTripletSum(nums, target));
    }
}
