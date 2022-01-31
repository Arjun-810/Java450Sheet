import java.util.Scanner;

public class stockTime {
    public static int bestprofit(int[] prices, int n) {
        int bp = 0;
        for (int i=0;i<n;i++)
            for (int j=i;j<n;j++){
                if(prices[i]<prices[j] && bp<prices[j]-prices[i]){
                    bp = prices[j]-prices[i];
                }
        }
        return bp;
    }
    public static void main(String[] args) {
        System.out.println("Best time to buy and Sell stock");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of days = ");
        int n = sc.nextInt();
        int[] prices = new int[n];
        System.out.print("Enter the prices on ith days = ");
        for (int i=0;i<n;i++)
            prices[i] = sc.nextInt();
        int profit = bestprofit(prices, n);
        System.out.println("Best profit = " + profit);
    }
}
