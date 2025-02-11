package JavaPracticeFeb08_14;

import java.util.Scanner;

/*
Make the below triangular pattern
*
**
***
****
*****
******
*******
********
 */
public class PyramidPattern1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the height of the triangle: ");
        int height = scanner.nextInt();
        for (int i = 0; i<height; i++)
        {
            for (int j = 0; j<=i;j++)
            {
                System.out.print('*');
            }
            System.out.println();

        }


    }
}
