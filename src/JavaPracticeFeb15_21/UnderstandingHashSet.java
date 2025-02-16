package JavaPracticeFeb15_21;

import java.util.ArrayList;
import java.util.HashSet;

public class UnderstandingHashSet {
    public static void main(String[] args) {

        HashSet<Integer> hashSet = new HashSet<>(2);
        System.out.println(hashSet.add(12));
        System.out.println(hashSet.add(23));
        System.out.println(hashSet.add(23));
        System.out.println(hashSet.add(54));
        System.out.println(hashSet);
        ArrayList<Integer> arrList = new ArrayList<>(hashSet);
        System.out.println(arrList);


        ArrayList<Integer> arrayList = new ArrayList<>(5);
        System.out.println(arrayList.add(23));
        System.out.println(arrayList.add(23));
        System.out.println(arrayList.add(54));
        System.out.println("ArrayList: " + arrayList);

        HashSet<Integer> set = new HashSet<>(arrayList);
        System.out.println("Arraylist coverted to Hashset " + set);


//
//        System.out.println(arrayList.get(2));
//
//        int[] array = {1, 4, 5};


    }
}
