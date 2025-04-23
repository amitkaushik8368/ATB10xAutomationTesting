package CodingQuestionsTarget_100;

import java.util.Scanner;



public class Lab_076
{
    //GCD(24, 36) → 12
    public static void main(String[] args) {
        System.out.println("Enter the two numbers: ");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt(), y= scanner.nextInt();

        int small = Math.min(x, y);
        for (int i = small ; i>0 ; i--)
        {
            if (x%i == 0 && y%i ==0)
            {
                System.out.println("Greatest Common Divisor : " + i);
                return;
            }
        }
    }
}
