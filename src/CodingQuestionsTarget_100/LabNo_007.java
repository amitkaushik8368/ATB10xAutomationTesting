package CodingQuestionsTarget_100;

/*
Write a program that classifies a triangle based on its side lengths.
Given three input values representing the lengths of the sides,
determine if the triangle is equilateral (all sides are equal), isosceles (exactly two sides are equal),
or scalene (no sides are equal). Use an if-else statement to classify the triangle
 */

import java.util.Scanner;

public class LabNo_007
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter all the three sides: ");
        int side1 = scanner.nextInt(), side2 = scanner.nextInt(), side3 = scanner.nextInt();

        String type = side1 == side2 ?
                (side2 == side3? "Equilateral Triangle" : "Isosceles Triangle")
                :  (side2 == side3? "Isosceles Triangle": side1!=side3? "Scalene Triangle" : "Isosceles Triangle")  ;

        System.out.println(type);
    }
}
