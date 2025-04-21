package CodingQuestionsTarget_100;

import java.util.Arrays;

public class Lab_No_069
{
    public static void main(String[] args) {


        String input = "This is Automation Testing";

        String [] inputArray = input.split(" ");

        StringBuilder stringBuilder = new StringBuilder();

        for (String s: inputArray){
            stringBuilder.append(reverseWord(s)).append(" ");
        }

        System.out.println(stringBuilder);




    }

    static StringBuilder reverseWord(String str){

        StringBuilder stringBuilder = new StringBuilder(str);
        stringBuilder.reverse();



        return stringBuilder;
    }
}
