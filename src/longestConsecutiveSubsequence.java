import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class longestConsecutiveSubsequence {
    public static int longestSubSequence(int[] arr, int n) {
        int lcs = 1, final_lcs = 0;
        Arrays.sort(arr);
        for (int i=1;i<n;i++){
            if (arr[i]-1 == arr[i-1]) {
                lcs++;
                final_lcs = Math.max(lcs,final_lcs);
            }
            else
                lcs = 1;
        }
        return final_lcs;
    }
    public static void main(String[] args) {
        System.out.println("Longest consecutive subsequence ");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array = ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++)
            arr[i] = sc.nextInt();
        int longestSubSeq = longestSubSequence(arr, n);
        System.out.println("Longest consecutive Subsequence = " + longestSubSeq);
    }
}
