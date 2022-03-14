package String;

import java.util.Scanner;

public class countStringIn2dArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        char[][] char_arr = new char[n][m];
        for (int i=0;i<n;i++)
            for (int j = 0; j < m; j++)
                char_arr[i][j] = sc.nextLine().charAt(0);
        System.out.println("abc");
    }
}
