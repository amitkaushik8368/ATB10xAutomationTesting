package JavaPracticeJan18_24;

/*
Program using ternary operator to find even and odd number
 */

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = scanner.nextInt();
        String result = (num%2==0)? "This is Even Number" : "This is Odd Number";
        System.out.println(result);


    }
}
