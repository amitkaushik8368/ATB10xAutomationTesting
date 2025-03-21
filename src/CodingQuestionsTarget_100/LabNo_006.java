package CodingQuestionsTarget_100;

/*
Write a program that classifies a triangle based on its side lengths.
Given three input values representing the lengths of the sides,
determine if the triangle is equilateral (all sides are equal), isosceles (exactly two sides are equal),
or scalene (no sides are equal). Use an if-else statement to classify the triangle
 */


import java.util.Scanner;

public class LabNo_006
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter all the three sides: ");
        int side1 = scanner.nextInt(), side2 = scanner.nextInt(), side3 = scanner.nextInt();

        if(side1 == side2 && side2 == side3)
            System.out.println("Equilateral Triangle");
        else if (side1 == side2 || side2 == side3 || side1 == side3)
            System.out.println("Isosceles Triangle");
        else
            System.out.println("Scalene Triangle");


    }
}
