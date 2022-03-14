package String;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class generateNewWord2 {
    public static String remove(String str,int idx) {
        // of a string using substring() method
        str = str.substring(0, idx)+str.substring(idx+1,  str.length() );

        // Return the modified string
        return str;
    }
    public static String genreateNewWord(String seq, String str) {
        List<Character> seq_char = new ArrayList<>();
        for (int i = 0; i < seq.length(); i++)
            seq_char.add(seq.charAt(i));
        for (int i = 0; i < seq.length(); i++)
            for (int j = i + 1; j < seq.length(); j++)
                if (seq.charAt(i) == seq.charAt(j))
                    return "New Language Error";
//        StringBuilder res = new StringBuilder();
//
//        String[] str_arr = str.split(" ");
//        for (String a : str_arr) {
//            StringBuilder temp = new StringBuilder();
//            String cap = a.toUpperCase();
//            String low = a.toLowerCase();
//            for (int i = 0; i < a.length(); i++) {
//                if (seq_char.contains(low.charAt(i)))
//                    temp.append(low.charAt(i));
//                if (seq_char.contains(cap.charAt(i)))
//                    temp.append(cap.charAt(i));
//            }
//            res.append(temp);
//            res.append(" ");
//        }
        StringBuilder res = new StringBuilder();
        String[] str_arr = str.split(" ");
        for (String a:str_arr){
            StringBuilder temp = new StringBuilder(a);
            for (int i=0;i<seq.length();i++) {
                if (seq.charAt(i) >= 'A' && seq.charAt(i) <= 'Z' || seq.charAt(i) >= 'a' && seq.charAt(i) <= 'z'){
                    if (seq.charAt(i) >= 'A' && seq.charAt(i) <= 'Z'){
                        char ax = (char) ((char) seq.charAt(i)+32);
                        while (temp.indexOf(String.valueOf(ax)) != -1) {
                            int idx = temp.indexOf(String.valueOf(ax));
                            temp = new StringBuilder(remove(String.valueOf(temp), idx));
                            res.append(seq.charAt(i));
                        }
                    }
                    if (seq.charAt(i) >= 'a' && seq.charAt(i) <= 'z'){
                        char ax = (char) ((char) seq.charAt(i)-32);
                        while (temp.indexOf(String.valueOf(ax)) != -1) {
                            int idx = temp.indexOf(String.valueOf(ax));
                            temp = new StringBuilder(remove(String.valueOf(temp), idx));
                            res.append(seq.charAt(i));
                        }
                    }

                    while (temp.indexOf(String.valueOf(seq.charAt(i))) != -1) {
                        int idx = temp.indexOf(String.valueOf(seq.charAt(i)));
                        temp = new StringBuilder(remove(String.valueOf(temp), idx));
                        res.append(seq.charAt(i));
                    }
                }else {
                    while (temp.indexOf(String.valueOf(seq.charAt(i))) != -1) {
                        int idx = temp.indexOf(String.valueOf(seq.charAt(i)));
                        temp = new StringBuilder(remove(String.valueOf(temp), idx));
                        res.append(seq.charAt(i));
                    }
                }
            }
            res.append(" ");
        }
        return res.toString().trim();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String seq = sc.nextLine();
        String str = sc.nextLine();
        String res = genreateNewWord(seq,str);
        System.out.print(res);
    }
}
