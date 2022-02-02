package Array;

import java.util.Scanner;

public class minJumpToEnd {
    public static int minJump(int[] arr) {
        int n = arr.length;
        int jump=1,i=1,f=arr[0];
        while (i<n){
            if(i==f){
                f+=arr[f];
                jump++;
            } else if(n<f){
                break;
            } else if(arr[f]<=arr[i]-arr[f]-i) {
                f = arr[i];
                i = f;
                jump++;
            }
            i++;
        }
        return jump;
    }
    public static void main(String[] args) {
        System.out.println("Minimum no. of Jumps to reach end of an array");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of array = ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        int j = minJump(arr);
        System.out.println("Minimum no. of Jumps to reach end of an array = " + j);
    }
}
