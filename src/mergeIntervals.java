import java.util.Scanner;

public class mergeIntervals {
    public static String merge(int[][] interval, int n) {
        String merged = "";
        for (int i=0;i<n;i++){
            if(interval[i][1]>interval[i+1][0]){

            }
        }
        return merged;
    }
    public static void main(String[] args) {
        System.out.print("Merge Intervals");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of intervals = ");
        int n = sc.nextInt();
        int[][] interval = new int[n][2];
        System.out.println("Enter the value of intervals =");
        for (int i=0;i<n;i++)
            for (int j=0;j<2;j++)
                interval[i][j] = sc.nextInt();
        String otp = merge(interval, n);
        System.out.println("Merged intervals = "+otp);
    }
}
