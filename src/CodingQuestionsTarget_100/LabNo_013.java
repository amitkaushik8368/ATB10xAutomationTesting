package CodingQuestionsTarget_100;

/*
Equilateral Triangle Pattern


    *
   ***
  *****
 *******
*********
 */

import java.util.Arrays;
import java.util.Scanner;

public class LabNo_013
{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of lines: ");
        int lines = scanner.nextInt();
        scanner.close();
        char[] row = new char[2*lines-1];
        Arrays.fill(row, ' ');
        int middleIndex = lines-1;
        for (int i = 0; i < lines; i++)
        {
            row[middleIndex-i] = '*';
            row[middleIndex+i] = '*';
            System.out.println(row);
        }



    }
}
