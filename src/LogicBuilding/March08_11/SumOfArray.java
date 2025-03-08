package LogicBuilding.March08_11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class SumOfArray
{
    public static void main(String[] args) {
        Integer[] array = {1, 2, 3, 4, 5, 6};

        int sumArray=0;
        for (int num:array)
            sumArray+=num;

        System.out.println(sumArray);

    }
}
