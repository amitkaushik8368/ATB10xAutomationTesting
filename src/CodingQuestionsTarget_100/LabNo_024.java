package CodingQuestionsTarget_100;

import java.util.IllegalFormatCodePointException;
import java.util.Scanner;

public class LabNo_024
{
    public static void main(String[] args) {
        /*
        Caesar Cipher - It works by shifting the letters in the plaintext message by a certain number of positions, known as the “shift” or “key”.
        Ex: Input = HELLO, key = 3.
        Output = KHOOR (H becomes K, shifted 3 letters front)
         */



        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String input = scanner.nextLine();
        System.out.println("Enter the key to move the characters: ");
        int key = scanner.nextInt();

        char[] inputArray = input.toCharArray();
        for (char ch: inputArray)
        {
            System.out.print(caesarCipher(ch, key));
        }
    }

    static char caesarCipher(char c, int key)
    {
//        char[] alphabets = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        //char[] alphabets = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        char[] alphabets = new char[26];
        for (int i = 0 ; i< 26; i++)
        {
            alphabets[i] = (char) ('A' + i);
        }
        int i = 0;

        for (; i< alphabets.length; i++)
        {
            if (alphabets[i]== c)
            {
                i+=key;
                break;
            }
        }
        if (i<alphabets.length)
        {
            return alphabets[i];
        } else return '*';


    }

}
