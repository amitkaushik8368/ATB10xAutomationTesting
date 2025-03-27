package CodingQuestionsTarget_100;

/*
Find first duplicate element inside an array
 */

import java.util.HashSet;
import java.util.Set;

public class LabNo_016
{
    public static void main(String[] args) {


        int[] array = {5, 3, 7, 0, 3,7, 10};
        //answer=3

        Set<Integer> set = new HashSet<>();

        for (int num: array)
        {
            if(!set.add(num))
            {
                System.out.println("First Duplicate number : " + num);
                return;
            }

        }

    }
}
