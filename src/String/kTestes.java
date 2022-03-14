package String;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class kTestes {
    public static int solve(int[] arr, int q) {
        int res = 0;
            List<List<Integer>> c = new ArrayList<List<Integer>>();
            List<Integer> l;
            for (int i = 0; i < arr.length; i++) {
                int k = c.size();
                int unit = 1;
                for (int j = 0; j < k; j++) {
                    unit *= arr[i];
                    l = new ArrayList<Integer>(c.get(j));
                    l.add(new Integer(arr[i]));
                    System.out.println("Arjun = "+arr[i]);
                    c.add(l);
                }
                l = new ArrayList<Integer>();
                l.add(new Integer(arr[i]));
                c.add(l);
            }
        System.out.println(c);
            return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        int k = sc.nextInt();
        int res = solve(arr,k);
        System.out.println(res);
    }
}
