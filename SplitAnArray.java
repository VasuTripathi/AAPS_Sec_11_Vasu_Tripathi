import java.util.Scanner;
import java.util.*;

public class SplitAnArray {
    public static int SplitArray(int arr[]) {
        int totalSum = 0;
        int leftSum = 0;
        for (int nums : arr) {
            totalSum += nums;
        }

        for (int i = 0; i < arr.length; i++) {
            leftSum += arr[i];

            if (leftSum == totalSum - leftSum) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the No. of elements int the array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the arrays ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int split = SplitArray(arr);
        System.out.println("Result " + split);

    }
}