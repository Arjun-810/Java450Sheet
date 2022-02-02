package Array;

import java.util.Scanner;

public class sumEqualToPair {
    public static int countEqualSum(int[] arr,int n, int k) {
        int count=0;
        for (int i=0;i<n;i++)
            for (int j=i+1;j<n;j++){
                if(arr[i]+arr[j] == k)
                    count++;
            }
        return count;
    }
    public static void main(String[] args) {
        System.out.println("find all pairs on integer array whose sum is equal to given number");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array = ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements in array = ");
        for (int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        System.out.print("Enter the value of k = ");
        int k = sc.nextInt();
        int count = countEqualSum(arr, n, k);
        System.out.println("No. of pairs on integer array whose sum is equal to given number = "+ count);
    }
}
