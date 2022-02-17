package String;

import java.util.Scanner;

public class countPalandromicSubSequence {
    public static boolean isPalindrome(String str) {
        boolean ispalind = false;
        for (int i=0;i<str.length()/2;i++){
            if(str.charAt(i) != str.charAt(str.length()-i-1))
                return false;
        }
        return true;
    }
    public static int countPalSub(String str) {
        int n = 0;
        for (int i=0;i<str.length();i++){
            String s = "";
            for (int j=i;j<str.length();j++){
                s += str.charAt(j);
                if(isPalindrome(s))
                    n++;
            }
        }
        return n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the expression = ");
        String str = sc.next();
        System.out.println("Count Palindromic Subsequences  = " + countPalSub(str));
    }
}
