package String;

import java.util.Scanner;

public class splitTwosubStrWitequal0And1 {
    public static String[] splitString(String str) {
        int zeros = 0,ones = 0;
        for (int i=0;i<str.length();i++){
            if(str.charAt(i) == '1')
                zeros++;
            else if (str.charAt(i) == '0')
                ones++;
        }
        int str1_zeroes = 0;
        int str2_zeroes = 0;
        int str1_ones = 0;
        int str2_ones = 0;
        int x = 0,y = 0;
        String str1 = "",str2 = "";
        for (int i=0;i<str.length();i++){

        }
        System.out.println(str1);
        System.out.println(str2);
        String[] string = {"a","v"};
        return string;
    }
    public static void main(String[] args) {
        System.out.println("Split the Binary string into two substring with equal 0’s and 1’s");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string = ");
        String str = sc.next();
        String[] sub_str = splitString(str);
        System.out.println("Substrings are " + sub_str[0] + " and " + sub_str[1]);
    }
}
