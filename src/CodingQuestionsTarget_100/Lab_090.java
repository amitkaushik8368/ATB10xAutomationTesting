package CodingQuestionsTarget_100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lab_090 {
    public static void main(String[] args) {

        Integer[] array = {1, 2, 3, 4, 5, 6, 7, 9};
        List<Integer> list = new ArrayList<>(Arrays.asList(array));

        for (int i = 0; i< 10 ; i++)
        {
            if (!list.contains(i))
            {
                System.out.println(i);
            }
        }




    }
}
