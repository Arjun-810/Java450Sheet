package Array;

import java.util.Scanner;

public class maxAndMin {
    public static int maxFromArray(int[] arr) {
        int max = Integer.MIN_VALUE;
        for(int a:arr){
            if(a>max)
                max = a;
        }
        return max;
    }
    public static int minFromArray(int[] arr) {
        int min = Integer.MAX_VALUE;
        for(int a:arr){
            if(a<min)
                min = a;
        }
        return min;
    }
    public static void main(String[] args) {
        System.out.println("Find the maximum and minimum element in an array:");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array = ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        int max = maxFromArray(arr);
        int min = minFromArray(arr);
        System.out.println("Maximum From Array = "+max);
        System.out.println("Minimum From Array = "+min);
    }
}
