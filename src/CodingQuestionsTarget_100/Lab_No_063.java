package CodingQuestionsTarget_100;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Lab_No_063
{
    public static void main(String[] args) {

        /*
        Write a Java program to sort HashMap with values
         */

        Map<Integer, Integer> map = new HashMap<>();

        map.put(0, 5);
        map.put(1, 6);
        map.put(2, 1);
        map.put(3, 4);
        map.put(4, 0);


        Set<Map.Entry<Integer, Integer>> set = map.entrySet();

        for (Map.Entry<Integer, Integer> entry: set)
        {
            System.out.println(entry.getValue());
        }



    }
}
