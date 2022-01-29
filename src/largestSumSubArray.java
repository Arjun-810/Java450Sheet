import java.util.Scanner;

public class largestSumSubArray {
    public static int largestSum(int[] arr) {
        int n = arr.length;
        int max = Integer.MIN_VALUE,sum = 0;
        for (int i=0;i<n;i++) {
            sum += arr[i];
            if (max < sum)
                max = sum;
            if (sum < 0)
                sum = 0;
        }
        return max;
    }
    public static void main(String[] args) {
        System.out.println("find Largest sum contiguous Subarray [V. IMP]");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array = ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        int max = largestSum(arr);
        System.out.println("Largest sum = "+ max);
    }
}
