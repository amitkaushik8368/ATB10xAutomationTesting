package CodingQuestionsTarget_100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Lab_No_056
{
    public static void main(String[] args) {
        /*
        Given an array (1,3,3,4,5,6,6,7,8,9,9) when user enters a search element, the program should display the index number where the element is found.
        If the element is repeated it should display all those indices. If it is not present in the given array program should display "element not found"
         */

        int[] input = {1,3,3,4,5,6,6,7,8,9,9};

        System.out.println("Enter the element you want to search inside array: ");
        Scanner scanner = new Scanner(System.in);
        int findElement = scanner.nextInt();
        scanner.close();


        List<Integer> list = new ArrayList<>();

        for (int i = 0 ; i< input.length; i++)
        {
            if (input[i] == findElement)
                list.add(i);
        }

        if (list.isEmpty())
            System.out.println("Element not found");
        else
            System.out.println("Element present at index: " + list);
    }
}
