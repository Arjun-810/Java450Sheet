package String;

import java.util.Scanner;

public class palindrome {
    public static boolean isPalindrome(String str) {
        String rev = new String();
        for (int i=str.length()-1;i>=0;i--)
            rev += str.charAt(i);
        boolean isPal = str.equalsIgnoreCase(rev);
        return isPal;
    }
    public static void main(String[] args) {
        System.out.println("Check whether a String is Palindrome or not");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string = ");
        String str = sc.next();
        boolean pal = isPalindrome(str);
        System.out.println("Is palindrome = " + pal);
    }
}