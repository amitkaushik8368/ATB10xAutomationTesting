package CodingQuestionsTarget_100;

import java.util.Arrays;

public class Lab_No_068
{
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5, 6};
        int [] arr2 = {4, 2, 5, 1, 6, 3};

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if (Arrays.equals(arr1, arr2))
            System.out.println("Arrays are equal");
        else System.out.println("Arrays are not equal");


    }
}
