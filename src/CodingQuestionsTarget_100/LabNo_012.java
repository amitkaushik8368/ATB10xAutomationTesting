package CodingQuestionsTarget_100;

/*
Equilateral Triangle Pattern


    *
   ***
  *****
 *******
*********
 */


import java.util.Scanner;

public class LabNo_012
{
    public static void main(String[] args) {

        System.out.println("Enter the lines of the triangle");
        Scanner scanner = new Scanner(System.in);
        int lines = scanner.nextInt();
        int count = lines;
        for (int i = 1 ; i < 2*lines; i = i+2)
        {
            System.out.print(" ".repeat(count--) + "*".repeat(i));
            System.out.println();
        }






    }
}
