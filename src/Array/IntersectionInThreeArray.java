package Array;

import java.util.Scanner;

public class IntersectionInThreeArray {
    public static String intersction(int[] arr1, int n1,int[] arr2, int n2,int[] arr3, int n3) {
        String inter="";
        for (int i=0;i<n1;i++){
            int j=0;
            while (arr1[i]>=arr2[j]){
                if(arr1[i] == arr2[j]){
                    int k = 0;
                    while (arr2[j]>=arr3[k]){
                        if (arr2[j] == arr3[k]){
                            inter += arr3[k]+ " ";
                            break;
                        }
                        k++;
                    }
                }
                j++;
            }
        }
        return inter;
    }
    public static void main(String[] args) {
        System.out.println("find common elements In 3 sorted arrays");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of first array = ");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        System.out.print("Enter the element of first array = ");
        for (int i=0;i<n1;i++)
            arr1[i] = sc.nextInt();
        System.out.print("Enter the length of second array = ");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        System.out.print("Enter the element of second array = ");
        for (int i=0;i<n2;i++)
            arr2[i] = sc.nextInt();
        System.out.print("Enter the length of third array = ");
        int n3 = sc.nextInt();
        int[] arr3 = new int[n3];
        System.out.print("Enter the element of third array = ");
        for (int i=0;i<n3;i++)
            arr3[i] = sc.nextInt();
        String str = intersction(arr1,n1,arr2,n2,arr3,n3);
        System.out.println("Intersection of three arrays = " + str);
    }
}
