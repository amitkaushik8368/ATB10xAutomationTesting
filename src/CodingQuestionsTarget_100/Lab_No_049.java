package CodingQuestionsTarget_100;

public class Lab_No_049
{
    public static void main(String[] args) {
        //Program to eliminate the vowels
        String input = "I am the interviewer";
        String output = input.replaceAll("[aeiouAEIOU]" , "");
        System.out.println(output);
    }
}
