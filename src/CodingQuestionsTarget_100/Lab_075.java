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

        if (x%2!=0 || x%3!=0 || x%5!=0 || x%7!=0)
        {
            System.out.println("The number is not prime");
        } else System.out.println("The number is Prime");
    }
}
