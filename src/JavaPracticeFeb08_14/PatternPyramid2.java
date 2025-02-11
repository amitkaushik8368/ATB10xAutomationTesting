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

public class PatternPyramid2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the height of the triangle: ");
        int height = scanner.nextInt();
        for (int i = 0; i<height; i++)
        {
            for (int x = i; x<height-1; x++)
            {
                System.out.print(" ");
            }
            for (int j = 0; j<=i;j++)
            {
                System.out.print('*');
            }
            System.out.println();

        }


    }
}
