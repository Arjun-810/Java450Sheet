package Array;

import java.util.Scanner;

public class MergeTwoSortedArray {
    public static int[] mergedTwoArray(int[] arr1, int[] arr2, int n1, int n2) {
        int[] merged = new int[n1+n2];
        int x=0,i=0,j=0;
        while (x<n1+n2){
            if (i<n1 && j<n2) {
                if (arr1[i] < arr2[j]) {
                    merged[x] = arr1[x];
                    i++;
                } else if (arr1[i] > arr2[j]) {
                    merged[x] = arr2[j];
                    j++;
                } else if (arr1[i] == arr2[j]) {
                    merged[x] = arr1[i];
                    i++;
                }
            }else if (i<n1){
                merged[x] = arr1[i];
                i++;
            }else if (j<n2){
                merged[x] = arr2[j];
                j++;
            }
            x++;
        }
        return merged;
    }
    public static void main(String[] args) {
        System.out.println("Merge 2 sorted arrays without using Extra space.");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of first sorted array = ");
        int n1 =sc.nextInt();
        int[] arr1 = new int[n1];
        for (int i=0;i<n1;i++)
            arr1[i] = sc.nextInt();
        System.out.print("Enter the length of second sorted array = ");
        int n2 =sc.nextInt();
        int[] arr2 = new int[n2];
        for (int i=0;i<n2;i++)
            arr2[i] = sc.nextInt();
        int[] merged = mergedTwoArray(arr1, arr2, n1, n2);
        for (int a: merged)
            System.out.print(a + " ");
    }
}
