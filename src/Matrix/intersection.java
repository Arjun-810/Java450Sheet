package Matrix;

import java.util.Arrays;
import java.util.Scanner;

public class intersection {
    public static String intersectionInRow(int[][] mtrx,int r,int c) {
        String inter = "";
        int f = 1;
        for (int i=0;i<r;i++)
            Arrays.sort(mtrx[i]);
        for (int i=0;i<c;i++){
            int check = mtrx[0][i];
            f = 1;
            for (int j=1;j<r;j++ ){
                for (int k=0;k<c;k++){
                    if (mtrx[j][k] == check) {
                        f++;
                        break;
                    }
                }
            }
            if(f == r){
                inter += check + " ";
            }
        }
        return inter;
    }
    public static void main(String[] args) {
        System.out.println("Common elements in all rows of a given matrix");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of rows = ");
        int r = sc.nextInt();
        System.out.print("Enter the no. of columns = ");
        int c = sc.nextInt();
        int[][] mtrx = new int[r][c];
        for (int i=0;i<r;i++)
            for (int j=0;j<c;j++)
                mtrx[i][j] = sc.nextInt();
        String inter = intersectionInRow(mtrx,r ,c);
        System.out.println("Common element in all row = " + inter);
    }
}
