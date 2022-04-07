package String;

import java.util.Scanner;

public class romanToDecimal {
    public static int value(String s) {
        int x = 0;
        switch (s){
            case "I":
                x = 1;
                break;
            case "V":
                x = 5;
                break;
            case "X":
                x = 10;
                break;
            case "L":
                x = 50;
                break;
            case "C":
                x = 100;
                break;
            case "D":
                x = 500;
                break;
            case "M":
                x = 1000;
                break;
            default:
                x = 0;
        }
        return x;
    }
    public static int romanToDec(String str) {
        int decimal = 0;
        for (int i=0;i<str.length();i++){
            int x = value(String.valueOf(str.charAt(i)));
            if (i+1 < str.length()){
                int y = value(String.valueOf(str.charAt(i+1)));
                if (x>=y)
                    decimal += 2;
            }
            decimal += x;
        }
        return decimal;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("Roman to decimal  = "+romanToDec(str));
    }
}
