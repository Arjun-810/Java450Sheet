package Matrix;

import java.util.Arrays;
import java.util.Scanner;

public class sortMatrix {
    public static int[][] sortMtrx(int[][] mtr ,int x ,int y) {
        int[][] sorted = new int[x][y];
        int[] arr = new int[x*y];
        int f = 0;
        for (int i=0;i<x;i++)
            for (int j=0;j<y;j++) {
                arr[f] = mtr[i][j];
                f++;
            }
        Arrays.sort(arr);
        f = 0;
        for (int i=0;i<x;i++)
            for (int j=0;j<y;j++) {
                sorted[i][j] = arr[f];
                f++;
            }
        return sorted;
    }
    public static void main(String[] args) {
        System.out.println("Print elements in sorted order using row-column wise sorted matrix");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows of matrix =  ");
        int x = sc.nextInt();
        System.out.print("Enter the number of columns of matrix =  ");
        int y = sc.nextInt();
        int[][] mtr = new int[x][y];
        for (int i=0; i<x;i++)
            for (int j=0;j<y;j++)
                mtr[i][j] = sc.nextInt();
        int[][] sorted = sortMtrx(mtr,x,y);
        for (int i=0; i<x;i++) {
            for (int j = 0; j < y; j++)
                System.out.print(sorted[i][j] + " ");
            System.out.println("");
        }
    }
}
