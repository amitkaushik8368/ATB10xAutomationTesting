package CodingQuestionsTarget_100;

import java.util.Scanner;

/*
Write a program that classifies a triangle based on its side lengths.
Given three input values representing the lengths of the sides,
determine if the triangle is equilateral (all sides are equal), isosceles (exactly two sides are equal),
or scalene (no sides are equal). Use an if-else statement to classify the triangle
 */
public class LabNo_008
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter all the three sides: ");
        int side1 = scanner.nextInt(), side2 = scanner.nextInt(), side3 = scanner.nextInt();

        String triangleType = (side1 == side2) && (side2 == side3) ? "Equilateral Triangle" :
                (side1 == side2) || (side2 == side3) || (side1 == side3) ? "Isosceles Triangle" : "Scalene Triangle";

        System.out.println(triangleType);



    }
}
