package JavaPracticeFeb15_21;

import java.util.ArrayList;
import java.util.Arrays;

/*
Shift all the zero elements to the right of the array whilst maintaining the original order
 */
public class ArrayLab001
{
    public static void main(String[] args)
    {
        int[] input = {0, 4, 2, 0, 5, 0, 0, 3, 0, 8};
        /*
        1. 0 at index 0 will be swapped by 4 at index 1
        2. 0 at index 1 will be swapped by 2 at index 2
        3. 0 at index 2 will be swapped by 5 at index 4
        4. 0 at index 3 will be swapped by 3 at index 7
        5. 0 at index 4 will be swapped by 8 at index 9
         */

        for (int i = 0; i < input.length; i++)
        {
            if (input[i] == 0)
            {
                for (int j = i+1; j<input.length; j++)
                {
                    if (input[j] != 0)
                    {
                        input[i] = input[j];
                        input[j] = 0;
                        break;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(input));

    }
}
