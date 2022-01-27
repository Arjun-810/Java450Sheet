import java.util.Scanner;

public class sort012 {
    public static int[] sortedArray(int[] arr) {
        int n = arr.length;
        int[] sorted = new int[arr.length];
        int a0 = 0, a1 = 0, a2 = 0;
        for (int a : arr) {
            if (a == 0)
                a0++;
            else if (a == 1)
                a1++;
            else
                a2++;
        }
        for (int i = 0; i < n; i++) {
            if (a0 > 0) {
                sorted[i] = 0;
                a0--;
            } else if (a1 > 0) {
                sorted[i] = 1;
                a1--;
            } else {
                sorted[i] = 2;
                a2--;
            }
        }
        return sorted;
    }
    public static void main(String[] args) {
        System.out.println("Given an array which consists of only 0, 1 and 2. Sort the array without using any sorting algo");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of an array = ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
          arr[i] = sc.nextInt();
        int[] sorted = sortedArray(arr);
        for (int a:sorted)
            System.out.print(a+" ");
    }
}
