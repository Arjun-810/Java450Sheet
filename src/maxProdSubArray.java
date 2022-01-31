import java.util.Scanner;

public class maxProdSubArray {
    public static int maxProduct(int[] arr, int n) {
        int prod = 1,maxProd = 1;
        for (int i=0;i<n;i++) {
            for (int j = i; j < n; j++) {
                prod *= arr[j];
                if (prod>maxProd)
                    maxProd = prod;
            }
        }
        return maxProd;
    }
    public static void main(String[] args) {
        System.out.println("find maximum product subarray ");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array = ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        int prod = maxProduct(arr, n);
        System.out.println("Max product Subarray = "+ prod);

    }
}
