package CodingQuestionsTarget_100;

import java.util.ArrayList;
import java.util.List;
public class Lab_088
{
    static List<String> collectSubPalindromes = new ArrayList<>();
    public static void main(String[] args) {
        String input = "abbadada";
        for (int i = 0; i< input.length(); i++)
        {
            palindromeSubstringLength(input, i, i+1);
            palindromeSubstringLength(input, i, i);
        }
        getLongestSubString();
    }
    static void palindromeSubstringLength(String str, int left, int right)
    {

        while ( ( left>=0 && right < str.length() )  && str.charAt(left) == str.charAt(right) )
        {
            left--;
            right++;
        }
        palindromeString(str.substring(left+1, right));
    }

    static void palindromeString(String str) {
        collectSubPalindromes.add(str);
    }

    static void getLongestSubString()
    {

        String longestString = null;
        int length = 0;

        for (String s : collectSubPalindromes)
        {
            if (s.length()>length)
            {
                longestString = s;
                length = s.length();
            }
        }

        System.out.println(longestString);
    }
}
