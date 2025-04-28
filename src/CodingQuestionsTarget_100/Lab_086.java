package CodingQuestionsTarget_100;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Lab_086
{
    public static void main(String[] args) {

        /*


            *
           ***
          *****
         *******
          *****
           ***
            *



         */

        System.out.println("Enter the lines you want to print, be advised to give odd input: ");
        Scanner scanner = new Scanner(System.in);
        int lines = scanner.nextInt();
        if (lines%2 == 0)
        {
            System.out.println("Invalid Input");
            return;
        }
        int mid = lines/2;
        for (int i=0 ; i< lines; i++)
        {
            for (int j=0; j< lines ; j++)
            {
                if (i<=mid && j == mid - i)
                    System.out.print("*".repeat(2*i + 1));
                else if (i>mid)
                    System.out.print(" ");
                else System.out.print(" ");

            }
            System.out.println();
        }


    }
}


