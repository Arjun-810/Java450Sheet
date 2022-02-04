package String;

import java.util.Scanner;

public class reverse {
    public static String reverseString(String str) {
        String ans = new String();
        int len = str.length();
        for (int i=len-1;i>=0;i--)
            ans += str.charAt(i);
        return ans;
    }
    public static void main(String[] args) {
        System.out.println("Reverse a String");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any string = ");
        String str = sc.nextLine();
        String output = reverseString(str);
        System.out.println("Reversed String = " + output);
    }
}
