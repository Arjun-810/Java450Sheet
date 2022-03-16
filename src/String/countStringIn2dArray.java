package String;

import java.util.Scanner;

public class countStringIn2dArray {
    public static int countString(char[][] char_arr,String str) {
        int count  = 0,str_len = str.length(),row = char_arr.length,col = char_arr[0].length;

        for (int i=0;i<char_arr.length;i++){
            for (int j = 0; j < char_arr[i].length; j++) {
                if (char_arr[i][j] == str.charAt(0)){
                    //Check front
                    if (col-j >=str_len) {
                        int f = 0;
                        for (int p=j;p<col+str_len;p++)
                              if (char_arr[i][p] != str.charAt(p-j)) {
                                f = 1;
                                break;
                            }
                        if (f==0) count++;
                    }
                    //check back
                    if (j>= str_len) {
                        int f = 0;
                        for (int p=j;p>j-str_len;p--)
                            if (char_arr[i][p] != str.charAt(j-p)) {
                                f = 1;
                                break;
                            }
                        if (f==0)count++;
                    }
                    //check bottom
                    if (row-i>=str_len){
                        int f = 0;
                        for (int p=i;p<i+str_len;p++)
                            if (char_arr[p][j] != str.charAt(p-i)) {
                                f = 1;
                                break;
                            }
                        if (f==0)count++;
                    }
                    //check top
                    if (i>=str_len){
                        int f = 0;
                        for (int p=i;p>i-str_len;p--)
                            if (char_arr[p][j] != str.charAt(i-p)) {
                                f = 1;
                                break;
                            }
                        if (f==0)count++;
                    }
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] char_arr = {
                {'B','B','M','B','B','B'},
                {'C','B','A','B','B', 'B'},
                {'I','B','G','B','B','B'},
                {'G','B','I','B','B','B'},
                {'A','B','C','B','B','B'},
                {'M','C','I','G','A','M'}
        };
        System.out.print("Enter the String you want to search = ");
        String str = sc.nextLine();
        System.out.println(countString(char_arr,str));
    }
}
