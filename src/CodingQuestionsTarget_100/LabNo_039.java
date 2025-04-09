package CodingQuestionsTarget_100;

import java.util.Arrays;

public class LabNo_039
{
    public static void main(String[] args)
    {

        //Rotate the array to Kth position

        //if k =2 output = {0, 3, 12, 0, 1}

        int[] array = {0, 1, 0, 3, 12};
        int k = 4, i = 0;

        while(i<k){
            int temp = array[0];
            for (int j=0; j<array.length-1; j++)
            {
                array[j] = array[j+1];
            }
            array[array.length-1] = temp;
            i++;
        }
        System.out.println(Arrays.toString(array));




    }
}
