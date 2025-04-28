package CodingQuestionsTarget_100;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Lab_087
{
    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();
        map.put(0, "Amit");
        map.put(1, "Sharma");
        map.put(2, "Pratima");
        map.put(3, "Kaushik");


        for (Map.Entry<Integer, String> integerStringEntry : map.entrySet()) {
            System.out.println(integerStringEntry);
        }


    }
}
