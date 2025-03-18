package LogicBuilding.March18_21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseArrayList
{
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        List<Integer> list1 = list.reversed();
        System.out.println(list1);



    }
}
