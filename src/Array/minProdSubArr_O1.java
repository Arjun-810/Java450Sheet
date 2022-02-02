package Array;

import java.util.Scanner;

public class minProdSubArr_O1 {
    public static int maxProduct_On(int[] arr,int n) {
        int prod = 1, max = 1,min=1, temp = 1;
        for (int i=0;i<n;i++){
            if (arr[i]>0){
                max *= arr[i];
            }else if (arr[i] == 0){
                max = 1;
                min = 1;
            }else{
                temp = max;
                max = Math.max(arr[i]*min,1);
                min = arr[i]*temp;
            }
            prod = Math.max(max, min);
        }
        return prod;
    }
    public static void main(String[] args) {
        System.out.println("find maximum product subarray ");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array = ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        int prod = maxProduct_On(arr, n);
        System.out.println("Max product Subarray = "+ prod);
    }

}
