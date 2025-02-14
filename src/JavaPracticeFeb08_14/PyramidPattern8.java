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
public class PyramidPattern8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the lines of pyramid:");
        int height = scanner.nextInt();
        if (height % 2 == 0 || height < 1) System.out.println("Pyramid can't be formed with this input");
        else {
            int middle = height/2;
            for (int i = 0; i<height; i++)
            {
                int spaces, stars;
                spaces = i<=middle?middle-i:i-middle;
                stars = i<=middle?2*i+1:2*(height-i)-1;
                System.out.print(" ".repeat(spaces));
                System.out.println("*".repeat(stars));
            }
        }

    }
}
