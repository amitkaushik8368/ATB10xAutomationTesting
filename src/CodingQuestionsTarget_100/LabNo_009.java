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

public class LabNo_009
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the side length of the triangle in number");
        int length = scanner.nextInt();
        for (int i = 1; i<=length;i++)
        {
            System.out.println("*".repeat(i));
        }


    }
}
