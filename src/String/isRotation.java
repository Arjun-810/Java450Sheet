package String;

import java.util.Locale;
import java.util.Scanner;

public class isRotation {
    public static boolean checkRotated(String str1,String str2) {
        String temp = str1+str1;
        int f = temp.indexOf(str2);
        if(f>0 && str1.length() == str2.length())
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        System.out.println("Write a Code to check whether one string is a rotation of another");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the source string = ");
        String str1 = sc.next();
        System.out.print("Enter the target string = ");
        String str2 = sc.next();
        boolean isRotated = checkRotated(str1.toLowerCase(),str2.toLowerCase());
        System.out.print("Is rotated = " + isRotated);
    }
}
