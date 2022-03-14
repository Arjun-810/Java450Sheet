package String;// Java program for the above approach
import java.util.*;

class GFG{

    // Function to find the lexicographically
// maximum string by reversing substrings
// having even numbers of 1s
    static void lexicographicallyMax(String s)
    {

        // Store size of string
        int n = s.length();

        // Traverse the string
        for(int i = 0; i < n; i++)
        {

            // Count the number of 1s
            int count = 0;

            // Stores the starting index
            int beg = i;

            // Stores the end index
            int end = i;

            // Increment count, when 1
            // is encountered
            if (s.charAt(i) == '1')
                count++;

            // Traverse the remaining string
            for(int j = i + 1; j < n; j++)
            {
                if (s.charAt(j) == '1')
                    count++;

                if (count % 2 == 0 &&
                        count != 0)
                {
                    end = j;
                    break;
                }
            }

            // Reverse the string from
            // starting and end index
            s = reverse(s, beg, end + 1);
        }

        // Printing the string
        System.out.println(s);
    }

    static String reverse(String s, int beg, int end)
    {
        StringBuilder x = new StringBuilder("");

        for(int i = 0; i < beg; i++)
            x.append(s.charAt(i));
        for(int i = end - 1; i >= beg; i--)
            x.append(s.charAt(i));
        for(int i = end; i < s.length(); i++)
            x.append(s.charAt(i));

        return x.toString();
    }

    // Driver Code
    public static void main(String args[])
    {
        String S = "0101";

        lexicographicallyMax(S);
    }
}

// This code is contributed by jyoti369
