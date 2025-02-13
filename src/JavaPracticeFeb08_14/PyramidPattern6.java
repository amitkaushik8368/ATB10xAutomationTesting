package JavaPracticeFeb08_14;

import java.util.Scanner;

/*
Make the below Pyramid Pattern

      *
     ***
    *****
   *******
    *****
     ***
      *
 */
public class PyramidPattern6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the lines of pyramid:");
        int height = scanner.nextInt();
        int parameter = height/2 +1;
        if (height % 2 == 0 || height < 1) System.out.println("Pyramid can't be formed with this input");
        else {
            for (int i = 0; i<height; i++)
            {
                if (i<=height/2)
                {
                    System.out.print(" ".repeat(--parameter));
                    System.out.println("*".repeat(height-2*parameter));
                } else {
                    System.out.print(" ".repeat(++parameter));
                    System.out.println("*".repeat(height-2*parameter));

                }
            }
        }

    }
}
