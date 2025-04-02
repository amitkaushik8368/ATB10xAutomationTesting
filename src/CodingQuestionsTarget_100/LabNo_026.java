package CodingQuestionsTarget_100;

/*
You are given an integer array where every number appears twice except one unique number.
Write a Java program to find that unique number in the most efficient way.

Example Input & Output:

Input:  [4, 3, 2, 4, 1, 3, 2]
Output:  1
 */


import java.util.Arrays;

public class LabNo_026
{
    public static void main(String[] args) {
        int[] input = {10, 3, 2, 11, 10, 1, 3, 2, 1, 11, 6, 15, 6, 0};
        Arrays.sort(input);
        for (int i = 0; i<input.length; i+=2)
        {
            if (i+1 == input.length || input[i] != input[i+1])
            {
                System.out.println("Unique: " + input[i]);
                return;
            }
        }


    }
}
