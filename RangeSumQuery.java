import java.util.Scanner;

public class RangeSumQuery {
        public static void prifixsum(int left, int right, int arr[]){
            int sum =0;
            for(int i=left; i<=right; i++){
                sum = sum+arr[i];
            }
            System.out.println(sum);
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter number of quiries");
            int no_of_Q = sc.nextInt();

            System.out.println("enter the length of array");

            int L_of_array = sc.nextInt();

            int arr[] = new int[L_of_array];

            for(int i=0; i<L_of_array; i++){
                System.out.println("enter"+i+"element");
                arr[i] = sc.nextInt();
            }
            for(int j=1; j<=no_of_Q; j++) {

                System.out.println("enter left index");
                int left = sc.nextInt();
                System.out.println("enter right index");
                int right = sc.nextInt();
                System.out.println("the sum between" + left + "and" + right + "is:");
                prifixsum(left, right, arr);
            }
    }
}
