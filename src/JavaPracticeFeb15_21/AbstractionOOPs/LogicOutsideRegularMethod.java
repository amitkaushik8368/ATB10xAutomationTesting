package JavaPracticeFeb15_21.AbstractionOOPs;

import java.util.Scanner;

public class LogicOutsideRegularMethod {
    public static void main(String[] args)
    {
        Sum_Subtract sS1;
        System.out.println("This statement is after class reference variable declaration");
        sS1= new Sum_Subtract();

        System.out.println("****************");

        Sum_Subtract sS2 = new Sum_Subtract();


    }

}

class Sum_Subtract
{

    Sum_Subtract()
    {
        System.out.println("I am inside the constructor, I am called after static and instance block");
    }

    {
//        int a, b;
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter two numbers: ");
//        a = scanner.nextInt();
//        b = scanner.nextByte();
//        int subtraction = a-b;
//        System.out.println("Subtraction of two numbers: " + subtraction);

        System.out.println("I am inside the instance block, I will be executed every time a new object/instance is created");
    }

    static
    {
//        int a, b;
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter two numbers: ");
//        a = scanner.nextInt();
//        b = scanner.nextByte();
//        int sum = a+b;
//        System.out.println("Sum of those two numbers is " + sum);

        System.out.println("I am inside the static block, I will be executed once in a program when class will be loaded");
    }



}


