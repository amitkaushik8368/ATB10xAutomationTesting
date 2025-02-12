package JavaPracticeFeb08_14;

/*
Make the below Pattern Pyramid

        *
       **
      ***
     ****
    *****
   ******
  *******
 ********


 */

import java.util.Scanner;

public class PyramidPattern3
{
    public static void main(String[] args)
    {
        System.out.println("Enter the height of the triangle");
        Scanner scanner = new Scanner(System.in);
        int height = scanner.nextInt();
        scanner.close();

        for (int i = 1 ; i <= height; i++)
        {
            System.out.print(" ".repeat(height-i));
            System.out.println("*".repeat(i));
        }


    }
}
