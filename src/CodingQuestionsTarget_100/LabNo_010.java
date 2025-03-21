package CodingQuestionsTarget_100;

/*
Form triangle pattern
*
**
***
****
*****
 */

import java.util.Scanner;

public class LabNo_010
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the side length of the triangle in number");
        int length = scanner.nextInt();
        for (int i = length-1; i>0;i--)
        {
            for (int j = length-i; j>0; j--)
                System.out.print("*");

            System.out.println();
        }


    }
}
