package LogicBuilding.March18_21;

import java.util.*;

public class WaysToInitializeAList
{
    public static void main(String[] args) {

        List<Integer> list1 = List.of(1, 2, 3, 4, 5, 6);
        List<Integer> list2 = new ArrayList<>(Arrays.asList(7, 8, 9, 10, 11, 12));
        List<Integer> list3 = new ArrayList<>();
        Collections.addAll(list3, 13, 14, 15, 16, 17);

        System.out.println("List1: " + list1);
        System.out.println("List2: " + list2);
        System.out.println("List3: " + list3);


    }
}
