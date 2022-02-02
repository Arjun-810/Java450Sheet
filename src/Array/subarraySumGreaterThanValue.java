package Array;

import java.util.Scanner;

public class subarraySumGreaterThanValue {
    public static int subArrayWithGreaterSum(int[] arr, int n, int s) {
        int no_elements = 0 ,sum = 0, final_elements = Integer.MAX_VALUE;
        for (int i=0;i<n;i++){
            no_elements = 0;
            sum = 0;
            for (int j=i;j<n;j++){
                sum += arr[j];
                no_elements++;
                if (sum>s){
                    final_elements = Math.min(no_elements, final_elements);
                    break;
                }
            }
        }
        return final_elements;
    }
    public static void main(String[] args) {
        System.out.println("Smallest Subarray with sum greater than a given value");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array = ");
        int n = sc.nextInt();
        System.out.print("Enter the elements of array = ");
        int[] arr = new int[n];
        for (int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        System.out.print("Enter the value of sum = ");
        int s = sc.nextInt();
        int no_elements = subArrayWithGreaterSum(arr, n, s);
        System.out.println("Smallest Subarray with sum greater than a given value = " + no_elements);
    }
}