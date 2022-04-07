package String;

import java.util.Scanner;

public class hackerRankPhoneNo {
    public static String findNo(String str) {
        int flag = 1;
        String res = new String();
        String[] str_arr = str.split(" ");
        for (int i=0;i<str_arr.length;i++){
            flag = 1;
            if (str_arr[i].equals("double")){
                flag = 2;
                i++;
            }
            if (str_arr[i].equals("triple")){
                flag = 3;
                i++;
            }
            while (flag>0){
            switch (str_arr[i]) {
                case "one":
                    res+='1';
                    break;
                case "two":
                    res+='2';
                    break;
                case "three":
                    res+='3';
                    break;
                case "four":
                    res+='4';
                    break;
                case "five":
                    res+='5';
                    break;
                case "six":
                    res+='6';
                    break;
                case "seven":
                    res+='7';
                    break;
                case "eight":
                    res+='8';
                    break;
                case "nine":
                    res+='9';
                    break;
                case "zero":
                    res+='0';
                    break;
            }
            flag--;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(findNo(str));
    }
}
