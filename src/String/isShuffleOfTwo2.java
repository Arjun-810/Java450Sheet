package String;

import java.util.Arrays;
import java.util.Scanner;

public class isShuffleOfTwo2 {
    public static String sortString(String str) {
        String sorted_str = new String();
        char[] char_array = str.toCharArray();
        Arrays.sort(char_array);
        sorted_str = String.valueOf(char_array);
        sorted_str = sorted_str.toLowerCase();
        return sorted_str;
    }
    public static String shuflleOfTwo(String str1, String str2, String[] arr) {
        String shuffel = "";
        String final_str = sortString(str1+str2);
        for (int i=0;i< arr.length;i++){
            String temp = sortString(arr[i]);
            if(temp.equals(final_str)){
                shuffel += arr[i]+" ";
            }
        }
        return shuffel;
    }
    public static void main(String[] args) {
        System.out.println("Write a Program to check whether a string is a valid shuffle of two strings or not OPTIMIZED");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string = ");
        String str1 = sc.next();
        System.out.print("Enter second string = ");
        String str2 = sc.next();
        System.out.print("Enter the length of array = ");
        int n = sc.nextInt();
        String[] arr = new String[n];
        for (int i=0;i<n;i++)
            arr[i] = sc.next();
        String final_string = shuflleOfTwo(str1, str2, arr);
        System.out.print("Shuffled string = " + final_string);
    }
}
