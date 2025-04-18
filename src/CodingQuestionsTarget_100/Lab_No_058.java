package CodingQuestionsTarget_100;

import java.util.*;

public class Lab_No_058
{
    public static void main(String[] args) {

        List<String> list = new ArrayList<>(Arrays.asList("Suresh", "Ramesh", "Chetan", "Ganesh", "Bhupesh"));

        Set<String> set = new TreeSet<>(list);
        System.out.println(set);


    }
}
