package Array;

import java.util.Arrays;
import java.util.Scanner;

public class elementAppearMoreThanNDIVK {
    public static String elementsCount(int[] arr, int n, int k) {
        String elements = "";
        Arrays.sort(arr);
        int c = n/k, f= 1;
        for (int i=1;i<n;i++){
            if (arr[i-1] == arr[i])
                f++;
            else {
                if(f>c)
                    elements += arr[i-1] + " ";
                f = 1;
            }
            if(f>c && i == n-1)
                elements += arr[n-1] + " ";
        }
        return elements;
    }
    public static void main(String[] args) {
        System.out.println("Given an array of size n and a number k, find all elements that appear more than n/k times");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array = ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        System.out.print("Enter the value of k = ");
        int k = sc.nextInt();
        String elements = elementsCount(arr,n,k);
        System.out.println("Elements appear more then n/k = " + elements);
    }
}
