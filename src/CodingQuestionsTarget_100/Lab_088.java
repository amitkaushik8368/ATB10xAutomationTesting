package CodingQuestionsTarget_100;

import java.util.HashMap;
import java.util.Map;

public class Lab_088
{
    public static void main(String[] args) {

        String input = "abbadad";

        Map<Integer, Integer> evenMap = new HashMap<>();
        Map<Integer, Integer> oddMap = new HashMap<>();
        int largestEvenSubstringPalindrome = 0;
        int largestOddSubstringPalindrome = 0;
        for (int i = 0; i< input.length(); i++)
        {
            int tempEvenPalindrome = palindromeSubstringLength(input, i, i+1);

            if (tempEvenPalindrome>largestEvenSubstringPalindrome)
                largestEvenSubstringPalindrome=tempEvenPalindrome;

            evenMap.put(i, tempEvenPalindrome);

            int tempOddPalindrome = palindromeSubstringLength(input, i, i);

            if (tempOddPalindrome>largestOddSubstringPalindrome)
                largestOddSubstringPalindrome=tempOddPalindrome;

            oddMap.put(i, tempOddPalindrome);
        }

        System.out.println("Odd Map" + oddMap);
        System.out.println("Even Map " + evenMap);

        System.out.println("______________");

        System.out.println(largestOddSubstringPalindrome);

        System.out.println("____________");
        System.out.println(largestEvenSubstringPalindrome);



    }


    static int palindromeSubstringLength(String str, int left, int right)
    {

        while ( ( left>=0 && right < str.length() )  && str.charAt(left) == str.charAt(right) )
        {
            left--;
            right++;
        }

        return  right-(left+1);
    }
}
