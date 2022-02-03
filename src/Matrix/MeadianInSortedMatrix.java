package Matrix;

import java.util.Arrays;
import java.util.Scanner;

public class MeadianInSortedMatrix {
    public static int medianInMatrix(int[][] mtr, int x, int y) {
        int[] arr = new int[x*y];
        int f = 0;
        for (int i=0;i<x;i++)
            for (int j=0;j<y;j++) {
                arr[f] = mtr[i][j];
                f++;
            }
        Arrays.sort(arr);
        int mid = x*y/2;
        int median = arr[mid];
        return median;
    }
    public static void main(String[] args) {
        System.out.println("Search an element in a matrix");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows of matrix =  ");
        int x = sc.nextInt();
        System.out.print("Enter the number of columns of matrix =  ");
        int y = sc.nextInt();
        int[][] mtr = new int[x][y];
        for (int i=0; i<x;i++)
            for (int j=0;j<y;j++)
                mtr[i][j] = sc.nextInt();
        int median = medianInMatrix(mtr,x , y);
        System.out.println("Median of matrix = " + median);
    }
}
