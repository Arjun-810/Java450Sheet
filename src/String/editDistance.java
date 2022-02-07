package String;

import java.util.Scanner;

public class editDistance {
    public static int minFromThree(int x,int y, int z){
        if(x>y&& y<z)
            return x;
        else if(y>x&& y>z)
            return y;
        else
            return z;
    }
    public static int editDist(String str1, String str2, int m, int n) {
        if(m == 0)
            return n;
        if (n == 0)
            return m;

        if (str1.charAt(m-1) == str2.charAt(n-1))
            return editDist(str1,str2,m-1,n-1);

        return 1+ minFromThree(editDist(str1,str2,m-1,n),editDist(str1,str2,m,n-1),editDist(str1,str2,m-1,n-1));
    }
    public static void main(String[] args) {
        System.out.println("Edit Distance ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string = ");
        String str1 = sc.next();
        System.out.println("Enter second string = ");
        String str2 = sc.next();
        int dist = editDist(str1, str2, str2.length(), str2.length());
        System.out.println("distance = " + dist);

    }
}
