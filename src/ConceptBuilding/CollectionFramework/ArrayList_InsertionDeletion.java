package ConceptBuilding.CollectionFramework;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_InsertionDeletion
{
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(10);
        System.out.println(list);
        list.add(12);
        list.add(32);
        list.add(22);
        list.add(45);

        list.add(2, 65);   // 65 will be added at index 2 and the elements at index 2 till the end will be right shifted by index 1
        list.set(1, 100);
        list.remove(3);


        System.out.println(list);
    }
}
