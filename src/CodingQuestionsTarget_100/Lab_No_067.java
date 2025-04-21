package CodingQuestionsTarget_100;

import java.util.Arrays;

public class Lab_No_067
{
    /*
    Check if two strings are Anagram
     */

    public static void main(String[] args)
    {

        String str1 = "listen";
        String str2 = "silent";

        char[] str1Array = str1.toCharArray();
        char[] str2Array = str2.toCharArray();


        Arrays.sort(str1Array);
        Arrays.sort(str2Array);

        if (Arrays.toString(str1Array).equals(Arrays.toString(str2Array)))
            System.out.println("String is Anagram");
        else
            System.out.println("String is not Anagram");






    }

}
