package CodingQuestionsTarget_100;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Lab_No_064
{
    public static void main(String[] args) {

        Set<String> set = new HashSet<>(Arrays.asList("Amit", "Sumit", "Pratima", "Rudra", "Mamta"));

//        set.forEach(System.out::println);

//        for (String s: set)
//            System.out.println(s);

        Iterator<String> iterator = set.iterator();
        System.out.println(iterator);
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }


    }
}
