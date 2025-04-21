package CodingQuestionsTarget_100;

import java.util.Arrays;

public class Lab_No_070
{
    public static void main(String[] args) {

        String input = "A man a plan a canal Panamp";
        String inputChecks = input.replaceAll(" ", "").toLowerCase();
        char[] inputArray = inputChecks.toCharArray();

        StringBuilder stringBuilder = new StringBuilder(inputChecks);
        stringBuilder.reverse();

        char[] reverseArray = stringBuilder.toString().toCharArray();


        if(Arrays.equals(inputArray, reverseArray)){
            System.out.println("Palindrome String");
        }else System.out.println("No Palindrome String");


    }
}
