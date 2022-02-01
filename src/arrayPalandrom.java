import java.util.Scanner;

public class arrayPalandrom {
    public static int minOperationsToPalandrom(int[] arr, int n) {
        int ans = 0;

        for (int i=0,j=n-1; i<=j;)
        {
            if (arr[i] == arr[j])
            {
                i++;
                j--;
            }

            else if (arr[i] > arr[j])
            {
                j--;
                arr[j] += arr[j+1] ;
                ans++;
            }

            else
            {
                i++;
                arr[i] += arr[i-1];
                ans++;
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        System.out.println("Minimum no. of operations required to make an array palindrome");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array = ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        int operations = minOperationsToPalandrom(arr, n);
        System.out.println("Minimum no. of operations required to make an array palindrome = " + operations);
    }
}
