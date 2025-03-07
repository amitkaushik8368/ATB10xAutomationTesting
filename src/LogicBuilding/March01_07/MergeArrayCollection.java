package LogicBuilding.March01_07;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeArrayCollection {
    public static void main(String[] args) {
        Integer[] array1 = {1, 2, 3, 4, 5};
        Integer[] array2 = {6, 7, 8, 9};

        ArrayList<Integer> mergedArray = new ArrayList<>(Arrays.asList(array1));
        System.out.println(mergedArray);

      //  mergedArray.addAll(array2);


    }
}
