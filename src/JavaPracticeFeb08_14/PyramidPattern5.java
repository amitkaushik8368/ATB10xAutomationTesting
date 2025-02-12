package JavaPracticeFeb08_14;

/*
Make the pyramid Patter:

        *
       ***
      *****
     *******
    *********

 */

import java.util.Scanner;

public class PyramidPattern5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the height of the triangle");
        int height = scanner.nextInt();
        int j = 1;
        for (int i = 1; i<2*height; i+=2)
        {
            System.out.print(" ".repeat(height-j));
            System.out.println("*".repeat(i));
            j++;
        }

    }
}
