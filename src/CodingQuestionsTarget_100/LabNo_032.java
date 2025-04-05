package CodingQuestionsTarget_100;

import java.util.Scanner;

public class LabNo_032
{
    public static void main(String[] args)
    {

        System.out.println("Enter the number of digits you want to print for Fabonacci ");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        scanner.close();
        for (int i = 0; i<x; i++)
            System.out.print(fabonnaciSeries(i) + " ");

    }

    static int fabonnaciSeries(int num)
    {
        if (num == 0)
            return 0;
        else if (num==1)
            return 1;
        else
            return fabonnaciSeries(num-1) + fabonnaciSeries(num-2);
    }
}
