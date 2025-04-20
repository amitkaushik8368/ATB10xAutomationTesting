package CodingQuestionsTarget_100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lab_No_065
{
    public static void main(String[] args) {
        //Convert the list of String to uppercase using Lambda Expression

        List<String> list = new ArrayList<>(Arrays.asList("Amit", "Sumit", "Pratima", "Rudra", "Mamta"));
        int i =0;
        for (String s: list)
        {
            String t = s.toUpperCase();
            list.set(i++, t);
        }
        System.out.println(list);


    }
}
