package ConceptBuilding.CollectionFramework;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetCollections2
{
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();
        set.add(100);
        set.add(34);
        set.add(12);
        set.add(45);
        System.out.println(set);   //Always print in ascending Order

        Integer[] array = {3, 6, 1, 0, 7};
        Set<Integer> set1 = new TreeSet<>(List.of(array));
        System.out.println(set1);
    }
}
