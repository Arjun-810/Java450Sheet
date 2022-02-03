package Matrix;

import java.util.Scanner;

public class spiralTraversal {
    public static String spiralTraversalMtrx(int[][] mtrx, int r, int c) {
        String traversed = "";
        int top = 0, bottom = r-1, left = 0, right = c-1,dir = 1;
        while (top <= bottom && left <= right){
            if (dir == 1){
                for (int i=left;i<=right;i++)
                    traversed += mtrx[top][i] + " ";
                top++;
                dir = 2;
            }
            else if(dir == 2){
                for (int i=top;i<=bottom;i++)
                    traversed += mtrx[i][right] + " ";
                right--;
                dir = 3;
            }
            else if (dir == 3){
                for (int i=right;i>=left;i--)
                    traversed += mtrx[bottom][i] + " ";
                bottom--;
                dir = 4;
            }
            else {
                for (int i= bottom;i>=top;i--)
                    traversed += mtrx[i][left] + " ";
                left++;
                dir=1;
            }
        }
        return traversed;
    }
    public static void main(String[] args) {
        System.out.println("Spiral traversal on a Matrix");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of rows = ");
        int r = sc.nextInt();
        System.out.print("Enter the no. of columns = ");
        int c = sc.nextInt();
        int[][] mtrx = new int[r][c];
        for (int i=0;i<r;i++)
            for (int j=0;j<c;j++)
                mtrx[i][j] = sc.nextInt();
        String traversed = spiralTraversalMtrx(mtrx, r ,c);
        System.out.println("Spiral Traversal = " + traversed);
    }
}
