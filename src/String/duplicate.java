package String;

import java.util.Scanner;

public class duplicate {
    public static int[] duplicateChar(String str) {
        int[] arr = new int[256];
        for (int i=0;i<str.length();i++)
            arr[str.charAt(i)]++;
        return arr;
    }
    public static void main(String[] args) {
        System.out.println("Find Duplicate characters in a string");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string = ");
        String str = sc.next();
        int[] arr = duplicateChar(str);
        String dup = new String();
        for (int i=0;i<arr.length;i++){
            if (arr[i] >1)
                dup += (char)i+ " " + arr[i] + "\n";
        }
        System.out.println("Duplicate characters = " + dup);
    }
}
