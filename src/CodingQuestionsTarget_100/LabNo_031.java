package CodingQuestionsTarget_100;

import java.util.Scanner;

public class LabNo_031
{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the fabonacci numbers you want to print: ");
        int prints = scanner.nextInt();
        scanner.close();

        int i=0 , x = 0, y = 1;

        while (i<prints)
        {
            i++;
            System.out.print(x + " ");
            int temp = x;
            x=y;
            y = temp+x;
        }

    }
}
