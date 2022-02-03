package Matrix;

import java.util.Scanner;

public class rotateMatrix {
    public static int[][] rotateMtrx(int[][] mtrx,int r,int c) {
        int[][] rot = new int[c][r];
        int f =c-1;
        for (int i=0;i<c;i++){
            for (int j=0;j<r;j++){
                rot[i][j] = mtrx[j][f];
            }
            f--;
        }
        return rot;
    }
    public static void main(String[] args) {
        System.out.println("Rotate matrix by 90 degrees");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of rows = ");
        int r = sc.nextInt();
        System.out.print("Enter the no. of columns = ");
        int c = sc.nextInt();
        int[][] mtrx = new int[r][c];
        for (int i=0;i<r;i++)
            for (int j=0;j<c;j++)
                mtrx[i][j] = sc.nextInt();
        int[][] rot = rotateMtrx(mtrx,r ,c);
        for (int i=0;i<c;i++) {
            for (int j=0;j<r;j++){
                System.out.print(rot[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
