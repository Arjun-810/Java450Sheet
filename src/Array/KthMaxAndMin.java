package Array;

import java.util.Scanner;

public class KthMaxAndMin {
    public static int[] sortedArray(int[] arr) {
        int n = arr.length;
        for (int i=0;i<n;i++){
            int min = Integer.MAX_VALUE;
            int pos = 0;
            for (int j=i;j<n;j++){
                if(arr[j]<min) {
                    min = arr[j];
                    pos = j;
                }
            }
            arr[pos] = arr[i];
            arr[i] = min;
        }
        return arr;

    }
    public static void main(String[] args) {
        System.out.println("Find the \"Kth\" max and min element of an array ");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array = ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        int[] sorted = sortedArray(arr);;
        System.out.print("Enter the Kth value you want to find = ");
        int k = sc.nextInt();
        System.out.println("Kth max element = "+arr[k-1]);
        System.out.println("kth min element = "+arr[n-k]);
    }
}
