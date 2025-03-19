package LogicBuilding.March18_21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseArrayList
{
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        // List<Integer> list1 = list.reversed();          Method 1  -> using another list object
        // Collections.reverse(list);                      Method 2   -> using Collections class

        /*   Method 3                                     -> using a loop
        int left = 0, right = list.size()-1;

        while(left<right)
        {
            int temp = list.get(left);
            list.set(left++, list.get(right));
            list.set(right--, temp);
        }

         */

        System.out.println("Reversed List : " + list);




    }
}
