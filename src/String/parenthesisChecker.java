package String;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class parenthesisChecker {
    public static boolean areParentgesisOk(String exp) {
        Deque<Character> stack = new ArrayDeque<Character>();
        for (int i=0;i<exp.length();i++) {
            char x = exp.charAt(i);
            if (x == '(' || x == '{' || x == '['){
                stack.push(x);
                continue;
            }
            if (stack.isEmpty())
                return false;
            char check;
            switch (x) {
                case ')':
                    check = stack.pop();
                    if (check == '{' || check == '[')
                        return false;
                    break;
                case ']':
                    check = stack.pop();
                    if (check == '{' || check == '(')
                        return false;
                    break;
                case '}':
                    check = stack.pop();
                    if (check == '(' || check == '[')
                        return false;
                    break;
            }
        }
        return (stack.isEmpty());
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the ecpression = ");
        String exp = sc.next();
        if(areParentgesisOk(exp))
            System.out.println("Balenced!");
        else
            System.out.println("Not Balenced!");
    }
}
