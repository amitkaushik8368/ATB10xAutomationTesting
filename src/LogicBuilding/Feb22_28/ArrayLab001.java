package LogicBuilding.Feb22_28;

import java.util.Arrays;

public class ArrayLab001
{
/*
    Rotate an array of integers 3 time and
    after each rotation last item should come at first place and all the other items should shift to next place
    Input : {1,2,3,4,5,6,7}
    Output : {7,1,2,3,4,5,6} , {6,7,1,2,3,4,5}, {5,6,7,1,2,3,4}
*/

    public static void main(String[] args) {
        int[] input = {1,2,3,4,5,6,7};
        for (int i=0; i<3; i++)
        {
            int temp = input[input.length-1];
            for (int j=0; j< input.length-1; j++)
            {
                input[j+1] = input[j];
            }
            input[0] = temp;
            System.out.println(Arrays.toString(input));
        }
    }
}
