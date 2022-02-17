package String;

import java.util.Scanner;

public class noOfStrIn2dArray {
    public static boolean match(char[][] char_arr,String str,String rev_str) {

    }
    public static int searchStr(char[][] char_arr,String str,String rev_str) {
        int n = 0;
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if (char_arr[i][j] == str.charAt(0) || char_arr[i][j] == rev_str.charAt(0))
                    if(match(char_arr,str,rev_str,))
                        n++;
            }
        }
        return n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array = ");
        int n = sc.nextInt();
        char[][] char_arr = new char[n][n];
        for (int i=0;i<n;i++)
            for (int j=0;j<n;j++)
                char_arr[i][j] = sc.next().charAt(0);
        System.out.print("Enter the string = ");
        String str = sc.next();
        StringBuilder sb=new StringBuilder(str);
        System.out.println("No. of sttring in 2d array = " + searchStr(char_arr, str, sb.reverse()));
    }
}
