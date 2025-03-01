package LogicBuilding.March01_07;

import java.util.Arrays;

public class SortAnArray
{
    public static void main(String[] args)
    {

        Integer[] array = {3, 6, 9, 2, 1, 7, 5};
        //output = {1, 2, 3, 5, 6, 7, 9}

        for (int i = 0; i<array.length; i++)
        {
            for (int j=i+1; j<array.length; j++)
            {
                if (array[i]>array[j])
                {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }



        System.out.println(Arrays.toString(array));


    }
}
