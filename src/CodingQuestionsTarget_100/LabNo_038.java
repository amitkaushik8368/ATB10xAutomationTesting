package CodingQuestionsTarget_100;

import java.util.Arrays;

public class LabNo_038
{
    public static void main(String[] args) {

        int[] array = {0, 1, 0, 3, 12};
        //Move all zeros to the end while maintaining order

        int moveElement = 0;
        for (int i = 0; i< array.length; i++)
        {
            for (int j =0 ; j< array.length-i-1 ; j++)
            {
                if (array[j] == moveElement)
                {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));



    }
}
