package CodingQuestionsTarget_100;

/*
Triangle Pattern

******
*****
****
***
**
*

 */

import java.util.Scanner;

public class LabNo_011
{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of the triangle : ");
        int length = scanner.nextInt();
        for (int i = length ; i >0 ; i--)
            System.out.println("*".repeat(i));

    }
}
