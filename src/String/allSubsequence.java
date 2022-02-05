package String;

import java.util.Scanner;

public class allSubsequence {
    public static void printAllSubsequence(String str) {
        for (int i=0;i<str.length();i++) {
            String sub_sequence = new String();
            for (int j = i; j < str.length(); j++) {
                sub_sequence += str.charAt(j);
                System.out.println(sub_sequence);
                for (int k=1;k<sub_sequence.length()-1;k++) {
                    StringBuffer sb = new StringBuffer(sub_sequence);
                    StringBuffer temp = sb.deleteCharAt(k);
                    System.out.println(temp);
                }
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("Print all Subsequences of a string.");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string = ");
        String str = sc.next();
        printAllSubsequence(str);
    }
}
