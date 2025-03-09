//Brute Force Approach
//import java.util.*;
//
//class PivotIndex{
//    // Method to find pivot index using brute force
//    public static int pivotIndex(int[] nums) {
//        int n = nums.length;
//
////        for (int i = 0; i < n; i++) {
////            int leftSum = 0, rightSum = 0;
////
////            // Compute left sum
////            for (int j = 0; j < i; j++) {
////                leftSum += nums[j];
////            }
////
////            // Compute right sum
////            for (int j = i + 1; j < n; j++) {
////                rightSum += nums[j];
////            }
////
////            // Check if both sums are equal
////            if (leftSum == rightSum) {
////                return i; // Found the pivot index
////            }
////        }
////
////        return -1; // No pivot index found
////    }
//
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        // Taking input for array size
//        System.out.print("Enter number of elements in the array: ");
//        int n = scanner.nextInt();
//
//        int[] nums = new int[n];
//
//        // Taking input for array elements
//        System.out.println("Enter the elements of the array:");
//        for (int i = 0; i < n; i++) {
//            nums[i] = scanner.nextInt();
//        }
//
//        // Calling the function and displaying result
//        int result = pivotIndex(nums);
//        System.out.println("Pivot Index: " + result);
//
//        scanner.close();
//    }
//}



//Optimized Approach
import java.util.*;

class PivotIndex {
    public static int pivotIndex(int[] nums) {
        int totalSum = 0, leftSum = 0;

        for (int num : nums) {
            totalSum += num;
        }


        for (int i = 0; i < nums.length; i++) {
            int rightSum = totalSum - leftSum - nums[i] ;

            if (leftSum == rightSum) {
                return i;
            }

            leftSum += nums[i];
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for array size
        System.out.print("Enter number of elements in the array: ");
        int n = scanner.nextInt();

        int[] nums = new int[n];

        // Taking input for array elements
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        // Calling the function and displaying result
        int result = pivotIndex(nums);
        System.out.println("Pivot Index: " + result);

        scanner.close();
    }
}
