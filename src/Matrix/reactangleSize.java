package Matrix;

import java.util.Scanner;

public class reactangleSize {
    public static int maxReactangeSize(int[][] mtrx, int r, int c) {
        int size = 0, flag = 0,row = 0,final_row = 0,break_row = 0;
        for (int i=0;i<r;i++) {
            flag = 0;
            for (int j = 0; j < c; j++) {
                if (mtrx[i][j] == 0)
                    flag = 1;
            }
            if (flag == 0) {
                row++;
                final_row = row;
            }
            else {
                break_row = final_row;
                row = 0;
                final_row = 0;
            }
            break_row = Math.max(break_row, final_row);
        }
        size = break_row*c;
        return size;
    }
    public static void main(String[] args) {
        System.out.println("Maximum size rectangle");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of rows = ");
        int r = sc.nextInt();
        System.out.print("Enter the no. of columns = ");
        int c = sc.nextInt();
        int[][] mtrx = new int[r][c];
        for (int i=0;i<r;i++)
            for (int j=0;j<c;j++)
                mtrx[i][j] = sc.nextInt();
        int size = maxReactangeSize(mtrx,r,c);
        System.out.println("Enter the maximum size of rectangle = " + size);
    }
}
