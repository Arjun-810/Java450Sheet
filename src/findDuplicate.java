import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class findDuplicate {
    public static String duplicateInArray(int[] arr, int n) {
        Arrays.sort(arr);
        int dup = 0;
        String str = "";
        for (int i=0;i<n-1;i++){
            if(arr[i] == arr[i+1] && dup != arr[i]){
                dup = arr[i];
                str+= arr[i] + " ";
            }
        }
        if(arr[n-1] == arr[n-2] && arr[n-1] != dup)
            str+= arr[n-1];
        return str;
    }
    public static void main(String[] args) {
        System.out.println("find duplicate in an array of N+1 Integers");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array = ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        String str = duplicateInArray(arr, n);
        System.out.println("Duplicate elements in array = "+str);
    }
}
