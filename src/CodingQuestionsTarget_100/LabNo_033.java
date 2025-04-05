package CodingQuestionsTarget_100;

/*
Find the longest palindrome subString
 */

import java.security.spec.RSAOtherPrimeInfo;

public class LabNo_033
{
    public static void main(String[] args)
    {

        String input = "babbabd";
        String longStr = "";
        int strLength = input.length();
        for (int i=0; i<strLength; i++)
        {
            String odd = expansionCheck(input, i, i);
            String even = expansionCheck(input, i, i+1);
            if (odd.length()>longStr.length())
                longStr = odd;
            if (even.length() > longStr.length())
                longStr = even;
            System.out.println("Iteration : " + i+1 + " : " + longStr);
        }

        System.out.println("Longest Palindrome : " + longStr);
    }

    static String expansionCheck(String str, int left, int right)
    {
        while (left>=0 && right<str.length() && str.charAt(left) == str.charAt(right))
        {
            left--;
            right++;
        }
        return str.substring(left+1, right);
    }

}
