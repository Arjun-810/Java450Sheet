import java.util.Scanner;

public class mergeIntervals {
    public static String merge(int[][] interval, int n) {
        String merged = "";
        int f = 0;
        for (int i=0;i<n-1;i++){
            if (f==0){
                merged += "["+ interval[i][0] + "," ;
            }
            if(interval[i][1]>=interval[i+1][0]){
                f=1;
                continue;
            }else {
                merged += interval[i][1] + "]";
                f=0;
            }
        }
        if (f==1){
            merged += interval[n-1][1]+"]";
        }else {
            merged += "["+interval[n-1][0]+","+interval[n-1][1]+"]";
        }
        return merged;
    }
    public static void main(String[] args) {
        System.out.print("Merge Intervals");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of intervals = ");
        int n = sc.nextInt();
        int[][] interval = new int[n][2];
        System.out.print("Enter the value of intervals =");
        for (int i=0;i<n;i++)
            for (int j=0;j<2;j++)
                interval[i][j] = sc.nextInt();
        String otp = merge(interval, n);
        System.out.println("Merged intervals = "+otp);
    }
}
