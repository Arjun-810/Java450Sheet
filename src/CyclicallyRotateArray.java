import java.util.Scanner;

public class CyclicallyRotateArray {
    public static int[] rotateArray(int[] arr) {
        int[] rot = new int[arr.length];
        rot[0] = arr[arr.length-1];
        for (int i=0;i< arr.length-1;i++){
            rot[i+1] = arr[i];
        }
        return rot;
    }
    public static void main(String[] args) {
        System.out.println("Write a program to cyclically rotate an array by one.");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array = ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        int[] rotated = rotateArray(arr);
        for (int a: rotated)
            System.out.print(a+" ");
    }
}
