package String;

import java.util.*;

import static java.lang.Math.pow;

public class helpMla2 {
    public static void findSubsets(int array[], int N)
    {
        //total number of possible non-empty sub-sequences
        int set_size = (int) pow(2, N) ;
        for (int i = 1; i < set_size; i++)
        {
            //printing subsequence
            System.out.print("[");
            for(int j = 0; j < N-1; j++)
            {
                int temp = (int) (1<<j);
                if( (i & temp) > 0)
                {
                    System.out.print(array[j]+",");
                }
            }
            System.out.println(array[N-1]+"]");
        }
    }

        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        findSubsets(arr,arr.length);
    }
}