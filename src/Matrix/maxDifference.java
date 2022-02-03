package Matrix;

import java.util.Scanner;

public class maxDifference {
    public static int specificPair(int[][] mtrx, int r, int c) {
        int diff= 0,max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        for (int i=0;i<r;i++)
            for (int j=0;j<c;j++) {
                max = Math.max(mtrx[i][j],max);
                min = Math.min(mtrx[i][j],min);
            }
        diff = max-min;
        return diff;
    }
    public static void main(String[] args) {
        System.out.println("Find a specific pair in Matrix");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of rows = ");
        int r = sc.nextInt();
        System.out.print("Enter the no. of columns = ");
        int c = sc.nextInt();
        int[][] mtrx = new int[r][c];
        for (int i=0;i<r;i++)
            for (int j=0;j<c;j++)
                mtrx[i][j] = sc.nextInt();
        int diff = specificPair(mtrx,r,c);
        System.out.println("Maximum difference = " + diff);
    }
}
