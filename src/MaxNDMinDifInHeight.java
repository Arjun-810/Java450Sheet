import java.util.Arrays;
import java.util.Scanner;

public class MaxNDMinDifInHeight {
    public static int DiffBTWMaxndMinHeight(int[] arr, int k) {
        int n = arr.length;
        int diff = 0, max = arr[arr.length]-k,min = arr[0]+k, d = max-min;
        Arrays.sort(arr);
        for (int i=0;i<n;i++){
            if(arr[i]+k<arr[i+1]-k)
                arr[i]+=k;
        }
        return diff;
    }
    public static void main(String[] args) {
        System.out.println("Minimise the maximum difference between heights.");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array = ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        System.out.print("Enter the value of k = ");
        int k = sc.nextInt();
        int max_diff = DiffBTWMaxndMinHeight(arr, k);
        System.out.println("Min difference between heights = " + max_diff);
    }
}
