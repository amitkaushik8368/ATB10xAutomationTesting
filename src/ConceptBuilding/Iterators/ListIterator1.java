package ConceptBuilding.Iterators;

import java.util.List;
import java.util.ListIterator;

public class ListIterator1 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5);

        ListIterator<Integer> listIterator = list.listIterator();
        System.out.println(listIterator.hasPrevious());
        System.out.println(listIterator.hasNext());
        System.out.println(listIterator.next());
        System.out.println(listIterator.next());
        //System.out.println(listIterator.nextIndex());

        System.out.println("-----------");
        System.out.println(listIterator.previous());

        int x;

    }
}
