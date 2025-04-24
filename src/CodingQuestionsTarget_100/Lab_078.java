package CodingQuestionsTarget_100;

import java.util.Arrays;
import java.util.Scanner;

public class Lab_078
{
    /*
    Given string str, the task is to write a Java program to swap the pairs of characters of a string.
    If the string contains an odd number of characters then the last character remains as it is.
     */
    public static void main(String[] args)
    {
        System.out.println("Enter the string: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int length = input.length();
        char[] charArray = input.toCharArray();

        if(length%2 == 0)
        {
            for (int i=0 ; i< length; i=i+2)
            {
                char temp = charArray[i];
                charArray[i] = charArray[i+1];
                charArray[i+1] = temp;
            }
        }else
        {
            for (int i=0 ; i< length-1; i=i+2)
            {
                char temp = charArray[i];
                charArray[i] = charArray[i+1];
                charArray[i+1] = temp;
            }
        }


        String output = String.valueOf(charArray);
        System.out.println(output);

    }
}
