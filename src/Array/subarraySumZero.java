package Array;

import java.util.Scanner;

public class subarraySumZero {
    public static boolean isSubArraySumZero(int[] arr, int n) {
        boolean isAva = false;
        for (int i=0;i<n;i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];
                if (sum == 0) {
                    isAva = true;
                    break;
                }
                if (isAva == true)
                    break;
            }
        }
        return isAva;
    }
    public static void main(String[] args) {
        System.out.println("Find if there is any subarray with sum equal to 0");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array = ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of array = ");
        for (int i=0; i<n;i++)
            arr[i] = sc.nextInt();
        boolean isAvailable = isSubArraySumZero(arr, n);
        if (isAvailable)
            System.out.println("Yes! Sub array with sum zero is available");
        else
            System.out.println("No! Sub array with sum zero is not available");
    }
}
