package ConceptBuilding.CollectionFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PrimitiveNonPrimitive
{
    public static void main(String[] args)
    {
        /*
        Delete an element from an ArrayList
         */

        Integer[] integers = new Integer[5];


        List<Integer> list = new ArrayList<>(Arrays.asList(5, 15, 25, 35, 45, 55));
        List<Integer> list1 = Arrays.asList(99, 88, 77, 66, 55);
        List<Integer> list2 = List.of(11, 22, 33, 44, 55);

        Collections.addAll(list, 101, 102, 103);
        System.out.println(list);

        System.out.println(list1.contains(88));
        System.out.println(list1);

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);

        System.out.println(list);

    }
}
