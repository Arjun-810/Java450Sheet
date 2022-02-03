package Matrix;

import java.util.Scanner;

public class maxDifference {
    public static int specificPair(int[][] mtrx, int row, int col) {
        int max = 0;
        for (int a=0;a<row-1;a++)
            for (int b=0;b<col-1;b++)
                for (int c = a;c<row;c++)
                    for (int d = b;d<col;d++)
                        max = Math.max(max, mtrx[c][d]-mtrx[a][b]);
        return max;
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
