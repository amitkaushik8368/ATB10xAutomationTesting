package JavaPracticeFeb02_07;
/*
*
* Check if the given character is alphabet or not using Built-in method
 */

import java.util.Scanner;

public class CheckCharIsAlphabet3 {
    public static void main(String[] args) {
        System.out.println("Enter the character: ");
        Scanner scanner = new Scanner(System.in);
        char ch = scanner.next().charAt(0);
        if (Character.isLetter(ch)){
            System.out.println("The input is an alphabet");
        }
        else System.out.println("The input is not an alphabet");
    }
}
