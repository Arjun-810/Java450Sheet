package Array;

import java.util.Arrays;
import java.util.Scanner;

public class chocolateDistribution {
    public static int chocDist(int[] pac, int n, int k) {
        int diff = Integer.MAX_VALUE, min = Integer.MAX_VALUE;
        Arrays.sort(pac);
        for (int i=0;i<n;i++){
            if (i+k<n){
                min = pac[i+k-1] - pac[i];
                diff = Math.min(diff, min);
            }else break;
        }
        return diff;
    }
    public static void main(String[] args) {
        System.out.println("Chocolate Distribution problem");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of packets = ");
        int n = sc.nextInt();
        System.out.print("Enter the chocolate in each packet = ");
        int[] pac = new int[n];
        for (int i=0;i<n;i++)
            pac[i] = sc.nextInt();
        System.out.print("Enter the no. of students = ");
        int k = sc.nextInt();
        int diff = chocDist(pac, n, k);
        System.out.println("Min difference between packets = " + diff);
    }
}
