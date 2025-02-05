package JavaPracticeFeb02_07;

import java.util.Scanner;

/*
Program to find whether a character is an alphabet or not
*public static final char[] UPPERCASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
    public static final char[] LOWERCASE = "abcdefghijklmnopqrstuvwxyz".toCharArray();
*
*
 */
public class CheckCharIsAlphabetThArray {
    public static void main(String[] args) {
        char[] alphabets = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz".toCharArray();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the character: ");
        char input = scanner.next().charAt(0);
        scanner.close();
        for (char ch : alphabets){
            if (ch == input){
                System.out.println("The character is alphabet");
                System.exit(0);
            }
        }

        System.out.println("Not an Alphabet");
    }
}
