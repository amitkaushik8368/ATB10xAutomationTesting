package ConceptBuilding.CollectionFramework;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListCollection
{
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        System.out.println(list.size());
        list.add(2);
        list.add(8);
        list.add(10);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);



    }
}
