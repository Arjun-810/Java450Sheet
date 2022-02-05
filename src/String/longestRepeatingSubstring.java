package String;

import java.util.Scanner;

public class longestRepeatingSubstring {
    public static int longestRepeat(String str) {
        int final_len = 0;
        for (int i=0;i<str.length()-1;i++) {
            String temp = new String();
            for (int j = i; j < str.length(); j++) {
                temp += str.charAt(j);
                int f = str.indexOf(temp,i+1);
                if (f>0)
                    final_len = Math.max(final_len,temp.length());
            }
        }
        return final_len;
    }
    public static void main(String[] args) {
        System.out.println("Find Longest Recurring Subsequence in String");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string = ");
        String str = sc.next();
        int len = longestRepeat(str);
        System.out.println("length of Longest Recurring Subsequence in String = " + len);
    }
}
