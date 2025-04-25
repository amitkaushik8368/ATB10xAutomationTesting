package CodingQuestionsTarget_100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lab_079
{
    public static void main(String[] args) {

        Integer[] array1 = {1,2,3,4,5};
        Integer[] array2 = {3,4,5,6,7};

        List<Integer> list = new ArrayList<>(Arrays.asList(array1));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(array2));

        List<Integer> list3 = new ArrayList<>();

        for (Integer num: list)
        {
            if (list2.contains(num))
            {
                list3.add(num);
            }
        }
        System.out.println(list3);


    }
}
