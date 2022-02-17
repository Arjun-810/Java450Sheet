package String;

import java.util.Scanner;
import java.util.Stack;

public class minBracketReversal {
    public static int reversalReq(String exp) {
        int n = 0;
        if (exp.length() %2 !=0)
            return -1;
        Stack<Character> s = new Stack<>();
        for (int i=0;i<exp.length();i++){
            if(exp.charAt(i) == '}' && !s.empty()) {
                if (s.peek() == '{') {
                    s.pop();
                    continue;
                }
                s.push(exp.charAt(i));
            }
            s.push(exp.charAt(i));
        }
        int red_len = s.size();
        while (!s.empty() && s.peek() == '{'){
            s.pop();
            n++;
        }
        return (red_len/2 + n%2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the expression = ");
        String exp = sc.next();
        System.out.print("Min no. of reversal required = " + reversalReq(exp));
    }
}
