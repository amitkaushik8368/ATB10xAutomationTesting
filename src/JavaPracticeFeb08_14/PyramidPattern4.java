package JavaPracticeFeb08_14;
/*
Make the below pyramid pattern

**********
 *********
  ********
   *******
    ******
     *****
      ****
       ***
        **
         *

 */


import java.util.Scanner;

public class PyramidPattern4
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the height of the pyramid:");
        int height = scanner.nextInt();
        scanner.close();
        for (int i = height; i>0; i--)
        {
            System.out.print(" ".repeat(height-i));
            System.out.println("*".repeat(i));
        }

    }
}
