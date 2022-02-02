package Array;

import java.util.Arrays;
import java.util.Scanner;

public class lessEqualGreaterK {
    public static int[] sorted(int[] arr) {
        Arrays.sort(arr);
        return arr;
    }
    public static void main(String[] args) {
        System.out.println("Minimum no. of operations required to make an array palindrome");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of elements = ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        int[] sorted = sorted(arr);
        int[] range = new int[2];
        System.out.print("Enter the range = ");
        for (int i=0;i<2;i++)
            range[i] = sc.nextInt();
        for (int a: sorted){
            System.out.print(a + " ");
        }

    }
}
