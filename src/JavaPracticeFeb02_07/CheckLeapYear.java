package JavaPracticeFeb02_07;

import java.util.Scanner;

/*
*
* Check if the year is a leap year
* Input: give me the year ->Int
* Output: Leap year/Not Leap Year -> String
* Rough Logic
* IF year % 400==0 -> leap year || (year %4 ==0 && year %100!=0(
*
 */
public class CheckLeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int year = scanner.nextInt();
        scanner.close();
        if(year % 400 == 0 || (year %4 == 0 && year % 100 !=0)){
            System.out.println("Leap Year");
        }
        else System.out.println("Not a leap year");
    }
}
