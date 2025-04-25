package CodingQuestionsTarget_100;

import java.util.Scanner;

public class Lab_081
{
    public static void main(String[] args) {

        System.out.println("Enter the count of occurrences you want to :");
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();

        for (int i=0 ; i< count; i++)
        {
            System.out.print(fibonacci(i) + " ");
        }




    }

    static int fibonacci(int num)
    {
        if(num<=1)
            return num;

        return fibonacci(num-1)+fibonacci(num-2);

    }
}
