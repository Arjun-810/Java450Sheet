package String;

import java.util.Scanner;

public class isShuffleOfTwo {
    public static String findShuffle(String str1, String str2, String[] arr) {
        String shuffle = "";
        String final_string = str1+str2;
        int[] arr_final = new int[256];
        for (int i=0;i<final_string.length();i++)
            arr_final[final_string.charAt(i)]++;
        for (int i=0;i<arr.length;i++){
            int[] count = new int[256];
            for (int j=0;j<arr[i].length();j++)
                count[arr[i].charAt(j)]++;
            int flag = 0;
            for (int k=0;k<256;k++){
                if(count[k] != arr_final[k])
                    flag++;
            }
            if (flag==0)
                shuffle += arr[i] + " ";
        }
        if (shuffle.equals("")){
            shuffle = "Not any string";
        }
        return shuffle;
    }
    public static void main(String[] args) {
        System.out.println("Write a Program to check whether a string is a valid shuffle of two strings or not");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first string = ");
        String str1 = sc.next();
        System.out.print("Enter the second string = ");
        String str2 = sc.next();
        System.out.print("Enter the length of array = ");
        int n = sc.nextInt();
        String[] arr = new String[n];
        for (int i=0;i<n;i++)
            arr[i] = sc.next();
        String shuffle = findShuffle(str1,str2,arr);
        System.out.println("string is a valid shuffle of two strings are "+ shuffle);
    }
}
