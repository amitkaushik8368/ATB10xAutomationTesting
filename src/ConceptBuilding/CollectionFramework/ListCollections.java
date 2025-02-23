package ConceptBuilding.CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListCollections {

    public static void main(String[] args)
    {
        /*
        With in the List interface we have below classes:
        1. ArrayList
        2. LinkedList
        3. Vectors
        4. Stack
         */
        String[] str = {"Amit", "Mamta", "Pratima"};
        List list = List.of(str);   //List.of is Static Method implements in List interface

        System.out.println(list.contains("Amit"));

        ListIterator listIterator = list.listIterator();

        System.out.println(listIterator.next());

//        Iterator iterator = list.iterator();
//        while(iterator.hasNext())
//        {
//            System.out.println(iterator.next());
//        }







    }
}
