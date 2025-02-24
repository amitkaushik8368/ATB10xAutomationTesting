package LogicBuilding.Feb22_28;

/*
Given an Array
Input : {1,2,3,4,5,6,7}
Rotate the array three times in such a way that it moves last element to the front whilst right shifting each element by 1
Output : {7,1,2,3,4,5,6} , {6,7,1,2,3,4,5}, {5,6,7,1,2,3,4}
 */

import java.util.*;

public class ArrayLab002
{
    public static void main(String[] args)
    {
        Integer[] input = {1, 2, 3, 4, 5, 6, 7};
        List<Integer> inputList = new ArrayList<>(Arrays.asList(input));
        System.out.println(inputList);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of times you want to rotate the array : ");
        int rotation = scanner.nextInt();

        for(int i =0; i<rotation; i++)
        {
            Integer x = inputList.remove(input.length-1);
            inputList.add(0, x);
            System.out.println((i+1) + " Rotation" + inputList);
        }

    }
}
