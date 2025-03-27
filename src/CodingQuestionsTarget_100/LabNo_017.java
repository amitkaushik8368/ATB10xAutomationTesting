package CodingQuestionsTarget_100;

/*
Find first duplicate element inside an array
 */

import java.util.HashSet;
import java.util.Set;

public class LabNo_017
{
    public static void main(String[] args) {


        int[] array = {5, 3, 51, 7, 0, 31, 71, 10,3, 5};
        int duplicateIndex=Integer.MAX_VALUE;
        boolean[] processed = new boolean[array.length];
        //answer=3
        for (int i = 0; i<array.length; i++)
        {
            for (int j = i+1; j< array.length; j++)
            {
                if (array[i] == array[j] & j<duplicateIndex)
                    duplicateIndex = j;
            }
        }

        System.out.println("First Duplicate : " + array[duplicateIndex]);

    }
}
