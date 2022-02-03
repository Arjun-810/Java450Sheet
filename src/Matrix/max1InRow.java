package Matrix;

import java.util.Scanner;

public class max1InRow {
    public static int maximun1InRow(int[][] mtr, int x,int y) {
        int max = 0,final_no = Integer.MIN_VALUE, row = -1;
        for (int i=0; i<x;i++) {
            max = 0;
            for (int j = 0; j < y; j++) {
                if (mtr[i][j] == 1){
                    max++;
                }
                if(max>final_no){
                    final_no = max;
                    row = i+1;
                }
            }
        }
        return row;
    }
    public static void main(String[] args) {
        System.out.println("Find row with maximum no. of 1's");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows of matrix =  ");
        int x = sc.nextInt();
        System.out.print("Enter the number of columns of matrix =  ");
        int y = sc.nextInt();
        int[][] mtr = new int[x][y];
        for (int i=0; i<x;i++)
            for (int j=0;j<y;j++)
                mtr[i][j] = sc.nextInt();
        int row = maximun1InRow(mtr,x ,y);
        System.out.println("Maximum no. of 1 in row = " + row);
    }
}
