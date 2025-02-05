package JavaPracticeFeb02_07;
/*
*
*
* Check if a character is an alphabet
* Input Char
* Output print if its alphabet
*
* Rough Logic
* char ch = 'x'
*
 *
 * */

import java.util.Scanner;

public class CheckCharIsAlphabet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the char: ");
        char c = scanner.next().charAt(0);
        for (char ch = 'a'; ch <= 'z' ; ch++)    //Character itself is integer and coverts to ASCII value
        {
            if (c == ch){
                System.out.println("Character is alphabet");
                System.exit(0);
            }
        }
        for (char ch = 'A'; ch <= 'Z'; ch++){
            if(c==ch){
                System.out.println("Character is Alphabet");
                System.exit(0);
            }
        }
        System.out.println("Character is not alphabet");
    }
}
