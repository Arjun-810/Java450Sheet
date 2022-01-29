import java.util.Scanner;

public class intersectionUnion {
    public static String unionTwoArray(int[] arr1, int[] arr2) {
        int n1 = arr1.length, n2 = arr2.length, i=0,j=0;
        String union="";
        while (i<n1 && j<n2){
            if(arr1[i] == arr2[j]){
                union = union + arr1[i]+" ";
                i++;
                j++;
            }
            else if(arr1[i] < arr2[j]){
                union = union + arr1[i]+" ";
                i++;
            }
            else {
                union = union + arr2[j]+" ";
                j++;
            }
        }
        while (i<n1){
            union+=arr1[i]+" ";
            i++;
        }
        while (j<n2){
            union = union +arr2[j]+" ";
            j++;
        }
        return union;
    }

    public static String intersectionTwoArray(int[] arr1, int[] arr2) {
        int n1 = arr1.length, n2 = arr2.length, i=0,j=0;
        String inter = "";
        while (i<n1 && j<n2){
            if(arr1[i] == arr2[j]){
                inter+=arr1[i]+" ";
                i++;
                j++;
            }else  if(arr1[i]<arr2[j])
                i++;
            else j++;
        }
        return inter;
    }
    public static void main(String[] args) {
        System.out.println("Find the Union and Intersection of the two sorted arrays.");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array = ");
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for (int i=0;i<n;i++)
            arr1[i] = sc.nextInt();
        System.out.print("Enter the length of second array = ");
        int m = sc.nextInt();
        int[] arr2 = new int[n];
        for (int i=0;i<m;i++)
            arr2[i] = sc.nextInt();
        String union_array = unionTwoArray(arr1, arr2);
        System.out.println("Union = "+union_array);
        String intersection_array = intersectionTwoArray(arr1, arr2);
        System.out.println("Intersection = " +intersection_array);

    }
}
