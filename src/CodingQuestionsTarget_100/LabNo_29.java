package CodingQuestionsTarget_100;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LabNo_29
{
    public static void main(String[] args) {

        /*
        Program to find first non-repeating character in a String
         */

        String str = "sambuddhas";
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (char c : str.toCharArray())
        {
            map.put(c, map.getOrDefault(c, 0)+1);
            System.out.println(map);
        }

        for (var obj : map.entrySet())
        {
            if(obj.getValue() == 1)
            {
                System.out.println(obj.getKey());
                return;
            }
        }
         System.out.println("No unique char");
    }
}
