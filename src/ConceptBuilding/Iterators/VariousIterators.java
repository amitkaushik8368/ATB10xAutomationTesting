package ConceptBuilding.Iterators;

import java.util.Iterator;
import java.util.List;

public class VariousIterators {
    public static void main(String[] args) {
          /*
        Iterating over a List
         */

        List<String> list = List.of("Amit", "Mamta", "Rudra", "Pratima");
        System.out.println(list.getClass().getName());
        //System.out.println(list);


        Iterator<String> itr = list.iterator();
        System.out.println(itr.next());
        System.out.println(itr.next());
        System.out.println(itr.next());
        System.out.println(itr.next());


        while (itr.hasNext())
        {
            System.out.println("Never enters the loop");
            System.out.println(itr.next());
        }




    }
}
