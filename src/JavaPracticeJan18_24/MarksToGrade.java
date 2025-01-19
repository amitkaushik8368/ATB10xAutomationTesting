package JavaPracticeJan18_24;
/*
Grading system will be like this:
Marks        Grade
90 - 100      'A'
80 -  89      'B'
70 -  79      'C'
60 -  69      'D'
   <60        'F'
 */
import java.util.Scanner;

public class MarksToGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter marks: ");
        int marks = scanner.nextInt();
        //char grade = marks<60 ? 'F' : marks >=90 & marks <=100 ? 'A' : marks >=70 & marks <80 ? 'C' :marks >= 80 & marks <90? 'B' : marks >= 60 & marks <70? 'D': 'E';
        //char grade = marks<60 ? 'F' : marks >= 80? marks >= 90? 'A' : 'B' : marks >= 70? 'C' : 'D' ;

        String grade1 = marks<60 ? "F" : marks >=90 & marks <=100 ? "A" : marks >=70 & marks <80 ? "C" :marks >= 80 & marks <90? "B" : marks >= 60 & marks <70? "D": "Invalid Number";

        System.out.println("Grade : " + grade1);
    }
}
