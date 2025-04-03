package CodingQuestionsTarget_100;

import java.util.HashMap;
import java.util.Map;

public class LabNo_027
{
    public static void main(String[] args)
    {

        String str = "Java Python Program Java Python Solve Java Hypothesis";
        String[] strArray = str.split("\\s");

        Map<String, Integer> map = new HashMap<>();
        for (String s : strArray)
        {
            map.put(s, map.getOrDefault(s, 0) +1);
        }

        //map.forEach((k, v) -> System.out.println(k + " " + v));

        for (var st : map.entrySet())
        {
            System.out.println(st.getKey() + " " + st.getValue());
        }

        var age = 0.2F;

        System.out.println(age);

    }
}
