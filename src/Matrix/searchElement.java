package Matrix;

import java.util.Scanner;

public class searchElement {
    public static String searchInMatrix(int[][] mtr, int x, int y, int s) {
        String otp = "";
        boolean f = false;
        for (int i=0; i<x;i++)
            for (int j=0;j<y;j++)
                if (mtr[i][j] == s) {
                    f = true;
                    otp = "Element found at index " + i+1 +" * "+j+1;
                }
        if (!f)
            otp = "Element not found!";
        return otp;
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
        System.out.print("Enter the element you want to search = ");
        int s = sc.nextInt();
        String otp = searchInMatrix(mtr,x , y ,s);
        System.out.println(otp);
    }
}
