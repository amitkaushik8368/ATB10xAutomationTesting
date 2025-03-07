package LogicBuilding.March01_07;

/*
Program to merge two integer arrays into one.
array1 = {1,2,3,4,5}
array2={6,7,8,9}

 */

import java.util.Arrays;

public class MergeIntegerArrays
{
    public static void main(String[] args) {
        int[] array1 = {1,2,3,4,5};
        int[] array2 = {6,7,8,9};

        int[] mergedArray = new int[array2.length+array1.length];
        int i, j=0;
        for (i=0;i<mergedArray.length;i++)
        {
            if (i<array1.length)
                mergedArray[i] = array1[i];
            else {
                mergedArray[i] = array2[j++];
            }
        }
        System.out.println(Arrays.toString(mergedArray));


    }


}
