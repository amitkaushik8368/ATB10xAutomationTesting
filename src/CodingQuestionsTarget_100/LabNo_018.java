package CodingQuestionsTarget_100;

import java.util.LinkedHashMap;
import java.util.Map;

/*
Java code to find first occurrence of first duplicate number inside an array
 */
public class LabNo_018
{
    public static void main(String[] args) {


        int[] array = {8, 7, 3, 10, 6, 6, 7, 8};
        //Output: 3

        Map<Integer, Integer> linkMap = new LinkedHashMap<>();

        for (int num: array)
        {
            linkMap.put(num, linkMap.getOrDefault(num, 0) + 1);
        }
        //System.out.println(linkMap);
       for (int key: linkMap.keySet())
       {
           if (linkMap.get(key) > 1)
           {
               System.out.println("First Duplicate number is : " + key);
               return;
           }
       }


    }
}
