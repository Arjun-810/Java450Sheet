package Array;

import java.util.Scanner;

public class negativeOnOneSide {
    public static int[] sortedArr(int[] arr) {
        for (int i=0;i< arr.length;i++){
            int min = Integer.MAX_VALUE;
            int pos = 0;
            for (int j=i;j< arr.length;j++){
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
        System.out.println("Move all the negative elements to one side of the array ");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array = ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        int[] sorted = sortedArr(arr);
        for (int a:arr)
            System.out.print(a+" ");
    }
}
