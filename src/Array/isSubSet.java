package Array;

import java.util.Arrays;
import java.util.Scanner;

public class isSubSet {
    public static boolean isPresentSubArray(int[] arr, int n ,int[] sub_arr, int s) {
        boolean isPresent = false;
        int k = 0,i=0,f=0;
        Arrays.sort(arr);
        Arrays.sort(sub_arr);
        while (i<n && k<s){
            if(sub_arr[k] == arr[i]) {
                k++;
                f++;
            }
            i++;
        }
        if (f==s)
            isPresent = true;
        return isPresent;
    }
    public static void main(String[] args) {
        System.out.println("Find whether an array is a subset of another array");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array = ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        System.out.print("Enter the length of subarray = ");
        int s = sc.nextInt();
        int[] sub_arr = new int[s];
        for (int i=0;i<s;i++)
            sub_arr[i] = sc.nextInt();
        boolean isPresent = isPresentSubArray(arr,n,sub_arr,s);
        if (isPresent)
            System.out.println("Yes!");
        else
            System.out.println("No!");
    }
}
