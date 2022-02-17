package String;

import java.util.Scanner;

public class mobileNumKetpadSequence {
    public static String keypadNum(String str) {
        String k = new String();
        String[] key_seq = {"2","22","222","3","33","333","4","44","444","5","55","555","6","66","666","7","77","777","7777","8","88","888","9","99","999","9999"};
        for (int i=0;i<str.length();i++){
            int x = str.charAt(i)-'a';
            System.out.println("arjun"+x);
            k += key_seq[x];
        }
        return k;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence = ");
        String str = sc.next();
        System.out.println("Sentence into its equivalent mobile numeric keypad sequence." + keypadNum(str.toLowerCase()));
    }
}
