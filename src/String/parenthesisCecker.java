package String;

import java.util.Scanner;

public class parenthesisCecker {
    public static boolean checkParenthesis(String str) {
        if(str.length() %2 == 0)
            return false;
        if(str.charAt(i) == '}' && str.charAt(i-1) == '}')


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string = ");
        String str = sc.next();
        boolean isOk = checkParenthesis(str);
        System.out.println("All Parenthesis are ok = "+isOk);
    }
}
