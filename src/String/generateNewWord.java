package String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class generateNewWord {
    public static String genreateNewWord(String seq, String str) {
        List<Character> seq_char = new ArrayList<>();
        for (int i=0;i<seq.length();i++)
            seq_char.add(seq.charAt(i));
        for (int i=0;i<seq.length();i++)
            for (int j=i+1;j<seq.length();j++)
                if (seq.charAt(i) == seq.charAt(j))
                    return "New Language Error";
        StringBuilder res = new StringBuilder();
        String[] str_arr = str.split(" ");
        for (String a:str_arr) {
            StringBuilder temp = new StringBuilder();
            String cap = a.toUpperCase();
            String low = a.toLowerCase();
            for (int i = 0; i < a.length(); i++) {
                if (seq_char.contains(low.charAt(i)))
                    temp.append(low.charAt(i));
                if (seq_char.contains(cap.charAt(i)))
                    temp.append(cap.charAt(i));
            }
            temp.reverse();
            res.append(temp);
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
