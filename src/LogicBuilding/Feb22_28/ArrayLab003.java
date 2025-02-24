package LogicBuilding.Feb22_28;

/*
Given an Array
Input : {1,2,3,4,5,6,7}
Rotate the array three times in such a way that it moves last element to the front whilst right shifting each element by 1
Output : {7,1,2,3,4,5,6} , {6,7,1,2,3,4,5}, {5,6,7,1,2,3,4}
 */

import java.util.*;

public class ArrayLab003
{
    public static void main(String[] args)
    {
        Integer[] input = {1,2,3,4,5,6,7};
        System.out.println("Original Array: " + Arrays.toString(input));
        List list = new ArrayList(Arrays.asList(input));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rotations: ");
        Integer rotation = scanner.nextInt();
        for (int i = 0; i<rotation; i++)
        {
            Collections.rotate(list, 1);
            System.out.println(list);
        }




    }
}
