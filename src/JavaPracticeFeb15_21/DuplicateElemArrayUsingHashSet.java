package JavaPracticeFeb15_21;

import java.util.ArrayList;
import java.util.HashSet;

//Find duplicate elements inside an array
public class DuplicateElemArrayUsingHashSet {
    public static void main(String[] args) {
        int[] array = {65, 34, 34, 43, 23, 43, 12, 23, 65, 23, 12, 65};
        Array_Duplicate_Find_NestedFor_Loop(array);
        Array_Duplicate_Find_HashSet(array);

    /*

    Logic:
    What gonna use: nested for loop
    inputs : boolean duplicateFound, boolean[] duplicateElementProcessed
    if(match found) duplicateFound = true & if(duplicateFound = true) print the number

     */



    }

    static void Array_Duplicate_Find_HashSet(int[] array)

    {
        /*
        Logic:
        Declare a Hashset -> It cannot contain duplicate elements
        use the add function to add elements from array into the Hashset and it return true if element inserted
        if duplicate element is found add that element to the Arraylist
         */
//array= {65, 34, 34, 43, 23, 43, 12, 23, 65, 23, 12, 65};
        HashSet<Integer> check = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();
        for(int num:array)
        {
            if(!check.add(num))
            {
                duplicates.add(num);
            }
        }
        System.out.println(duplicates);

    }


    static void Array_Duplicate_Find_NestedFor_Loop(int[] array)
    //array= {65, 34, 34, 43, 23, 43, 12, 23, 65, 23, 12, 65};
    {
        boolean[] duplicateElementProcessed = new boolean[array.length];
        System.out.println("Duplicate Elements");

        for (int i = 0; i < array.length; i++)
        {
            if (duplicateElementProcessed[i]) continue;;
            boolean duplicateFound=false;
            for (int j = i+1; j < array.length; j++)
            {
                if (array[i] == array[j])
                {
                    duplicateFound = true;
                    duplicateElementProcessed[j] = true;
                }

            }
            if (duplicateFound)
            {
                System.out.println(array[i]);
            }
        }
    }
}


