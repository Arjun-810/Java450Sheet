package Matrix;

import java.util.Scanner;

public class kTHSmallestElement {
    public static int Kthsmallest(int[][] mtrx,int r, int c, int k) {
        int[] arr = new int[k];
        for (int i=0;i<k;i++)
            arr[i] = Integer.MAX_VALUE;
        for (int i=0;i<r;i++)
            for (int j=0;j<c;j++){
                int temp = mtrx[i][j];
                for (int l = 0;l<k;l++){
                    if(arr[l]>temp){
                        int f = temp;
                        temp = arr[l];
                        arr[l] = f;
                    }
                }
            }
        return arr[k-1];
    }
    public static void main(String[] args) {
        System.out.println("Kth smallest element in a row-column wise sorted matrix");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of rows = ");
        int r = sc.nextInt();
        System.out.print("Enter the no. of columns = ");
        int c = sc.nextInt();
        int[][] mtrx = new int[r][c];
        for (int i=0;i<r;i++)
            for (int j=0;j<c;j++)
                mtrx[i][j] = sc.nextInt();
        System.out.print("Enter the value of k = ");
        int x = sc.nextInt();
        int k = Kthsmallest(mtrx,r,c,x);
        System.out.println("Kth smallest element = " + k);
    }
}
