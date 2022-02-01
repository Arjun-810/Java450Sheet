import java.util.Scanner;

public class trappingRainWater {
    public static int waterTrapped(int[] arr, int n) {
        int vol = 0, min = Math.min(arr[0], arr[n-1]);
        for (int i=1;i<n-1;i++){
            if (arr[i]>min)
                continue;
            vol += min - arr[i];
        }
        return vol;
    }
    public static void main(String[] args) {
        System.out.println("Trapping Rain water problem");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of pillar = ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        int volume = waterTrapped(arr, n);
        System.out.println("Total water trapped in between pillars = " + volume);
    }
}
