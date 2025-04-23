package CodingQuestionsTarget_100;

import java.util.Scanner;

public class Lab_075
{
    //Check if  the number is Prime
    public static void main(String[] args) {

        System.out.println("Enter the number : ");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        scanner.close();

        for (int i = 2 ; i<= Math.sqrt(x); i++)
        {
            if (x%i == 0)
            {
                System.out.println("number is not prime");
                return;
            }

        }
        System.out.println("Number is prime");
    }
}
