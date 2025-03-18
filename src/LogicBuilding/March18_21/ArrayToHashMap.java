package LogicBuilding.March18_21;

import java.util.HashMap;
import java.util.Map;

public class ArrayToHashMap
{
    public static void main(String[] args)
    {

        int[] array = {16, 6, 1, 8, 12};

        Map<Integer, Integer> arrayMap = new HashMap<>();
        for (int i =0; i<array.length; i++)
        {
            arrayMap.put(i, array[i]);
        }
        System.out.println(arrayMap);




    }
}
