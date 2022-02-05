package String;

import java.util.Scanner;

public class longestPalindromicSubstring {
    public static boolean checkPalindrom(String str) {
        boolean ispalin = true;
        for (int i=0;i<str.length();i++){
            if (str.charAt(i)!=str.charAt(str.length()-i-1))
                ispalin = false;
        }
        return ispalin;
    }
    public static String longestPalindromicSubstr(String str) {
        boolean isPalin = false;
        int len = 0,final_len = 0;
        String final_pali = new String();
        for (int i=0;i<str.length()-1;i++){
            String temp = new String();
            for (int j=i;j<str.length();j++){
                temp += str.charAt(j);
                if (temp.length()>1)
                    isPalin = checkPalindrom(temp.toLowerCase());
                if (isPalin == true) {
                    len = temp.length();
                    if (final_len<len){
                        final_len = len;
                        final_pali = temp;
                    }
                }
            }
        }
        return final_pali;
    }
    public static void main(String[] args) {
        System.out.println("Write a program to find the longest Palindrome in a string.[ Longest palindromic Substring]");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string = ");
        String str = sc.next();
        String ans = longestPalindromicSubstr(str);
        System.out.println("Longest palindrome substring = " + ans);
    }
}
