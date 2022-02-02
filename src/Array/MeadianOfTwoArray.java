package Array;

import java.util.Scanner;

public class MeadianOfTwoArray {
    public static int[] mergeTwoArray(int[] arr1, int n1, int[] arr2, int n2) {
        int[] merged = new int[n1+n2];
        int i=0,j=0,k=0;
        while (i<n1+n2){
            if(j<n1 && k<n2) {
                if (arr1[j] <= arr2[k]) {
                    merged[i] = arr1[j];
                    j++;
                } else {
                    merged[i] = arr2[k];
                    k++;
                }
            }
            else if (j<n1){
                merged[i] = arr1[j];
                j++;
            }else if(k<n2){
                merged[i] = arr2[k];
                k++;
            }
            i++;
        }
        return merged;
    }
    public static int meadianOfTwo(int[] arr1, int n1, int[] arr2, int n2) {
        int median = 0;
        int[] merged = mergeTwoArray(arr1, n1, arr2, n2);
        int n = merged.length;
        if(n%2 == 0){
            median = (merged[(n+1)/2]+merged[(n-1)/2])/2;
        }else {
            int k = n/2;
            median = merged[k];
        }
        return median;
    }
    public static void main(String[] args) {
        System.out.println("Meadian of two array:");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of first array = ");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        System.out.print("Enter the elements of first array = ");
        for (int i=0;i<n1;i++)
            arr1[i] = sc.nextInt();
        System.out.print("Enter the length of second array = ");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        System.out.print("Enter the elements of second array = ");
        for (int i=0;i<n2;i++)
            arr2[i] = sc.nextInt();
        int median = meadianOfTwo(arr1, n1, arr2, n2);
        System.out.println("Median of two arrays = " + median);

    }
}
