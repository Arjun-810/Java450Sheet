import java.util.Scanner;

public class FACTORIAL {
    public static long factorial(int n) {
        long fact = 1;
        for (int i=1;i<=n;i++)
            fact *= i;
        return fact;
    }
    public static void main(String[] args) {
        System.out.println("Find factorial of a large number = ");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number");
        int n = sc.nextInt();
        long fact = factorial(n);
        System.out.println("Factorial = " + fact);
    }
}
