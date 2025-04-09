package CodingQuestionsTarget_100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LabNo_037
{
    public static void main(String[] args) {
        /*
        Given an integer array having distinct numbers 0 to 7, I need to find the missing numbers
         */

        Integer[] input = {4, 7, 1, 5, 0};
        List<Integer> inputList = Arrays.asList(input);
        List<Integer> output = new ArrayList<>();

        int i = 0;
        while (i<=7)
        {
            if (!inputList.contains(i))
                output.add(i);

            i++;
        }

        System.out.println(output);


    }
}
