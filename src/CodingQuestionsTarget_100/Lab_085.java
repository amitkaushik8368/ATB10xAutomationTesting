package CodingQuestionsTarget_100;

import java.util.Scanner;

public class Lab_085
{
    public static void main(String[] args) {

        /*

            *
           ***
          *****
         *******
        *********


         */

        System.out.println("Enter the lines you want to print: ");
        Scanner scanner = new Scanner(System.in);
        int lines = scanner.nextInt();

        for (int i = 0; i< lines; i++)
        {
            for (int j = 0; j< 2*lines-1 ; j++)
            {
                if (j==lines-(i+1))
                    System.out.print("*".repeat(2*i+1));
                else System.out.print(" ");

            }
            System.out.println();
        }

    }
}
