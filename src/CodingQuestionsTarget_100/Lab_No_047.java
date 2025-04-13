package CodingQuestionsTarget_100;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Lab_No_047
{
    public static void main(String[] args) {
        //Write a program to find duplicate even numbers

        int[] array = {4, 7, 8, 14, 7, 9, 4, 17, 1, 8, 22};
        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for (int num: array)
        {
            if (num%2 == 0)
                list.add(num);
        }
        System.out.println(" Duplicate Even Below: ");
        for(int num: list)
        {
            if (!set.add(num))
            {
                System.out.println(num);
            }
        }

    }
}
