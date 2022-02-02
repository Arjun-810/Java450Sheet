package Array;

import java.util.Scanner;

public class ReverseArray {
    public static int[] reverseArr(int[] arr) {
        int[] rev = new int[arr.length];
        int j=0;
        for(int i=arr.length-1;i>=0;i--) {
            rev[j] = arr[i];
            j++;
        }
        return rev;
    }
    public static void main(String[] args) {
        System.out.println("Reverse the array:");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array = ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        int[] rev_arr = new int[n];
        rev_arr = reverseArr(arr);
        System.out.print("Reversed Array = ");
        for (int a: rev_arr)
            System.out.print(a+" ");
    }
}
