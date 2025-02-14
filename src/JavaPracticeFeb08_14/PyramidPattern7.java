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
public class PyramidPattern7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the lines of pyramid:");
        int height = scanner.nextInt();
        int middle = height/2;
        if (height % 2 == 0 || height < 1) System.out.println("Pyramid can't be formed with this input");
        else {
            for (int i = 0; i<height; i++)
            {
                if (i<=height/2)
                {
                    System.out.print(" ".repeat(middle-i));
                    System.out.println("*".repeat(2*i+1));
                } else {
                    System.out.print(" ".repeat(i-middle));
                    System.out.println("*".repeat(2*(height-i)-1));

                }
            }
        }

    }
}
