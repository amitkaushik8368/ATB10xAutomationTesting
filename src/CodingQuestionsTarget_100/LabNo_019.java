package CodingQuestionsTarget_100;

import java.util.EnumSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class LabNo_019
{
    public static void main(String[] args) {

        Map<Integer, String> linkHashMap = new LinkedHashMap<>();
        linkHashMap.put(1, "Amit Sharma");
        linkHashMap.put(2, "Mamta Rani");
        linkHashMap.put(3, "Rudra Kaushik");
        linkHashMap.put(4, "Pratima Kaushik");

//        linkHashMap.forEach(
//                (key, value) -> System.out.println(key + "->" + value)
//        );

//        for (Map.Entry<Integer, String> entry : linkHashMap.entrySet())
//        {
//            System.out.println(entry.getKey() + "->"  + entry.getValue());
//        }

        Iterator<Map.Entry<Integer, String>> iterator = linkHashMap.entrySet().iterator();
        while (iterator.hasNext())
        {
            iterator.next();
        }


    }
}
