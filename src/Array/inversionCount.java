package Array;

import java.util.Scanner;

public class inversionCount {
    public static int countInversion(int[] arr, int n) {
        int inv_count = 0;
        for (int i=0;i<n;i++){
            for (int j=i;j<n;j++){
                if(arr[i]>arr[j])
                    inv_count++;
            }
        }
        return inv_count;
    }
    public static void main(String[] args) {
        System.out.println("Find the Inversion Count in the array");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array = ");
        int n = sc.nextInt();
        System.out.print("Enter the elements of the array = ");
        int[] arr = new int[n];
        for (int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        int count = countInversion(arr, n);
        System.out.println("Inversion count = " + count);
    }
}
