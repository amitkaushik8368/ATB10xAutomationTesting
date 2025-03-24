package CodingQuestionsTarget_100;

/*
Count Vowels and consonants ina String
 */

public class LabNo_015
{
    public static void main(String[] args) {

        String input = "Amit Sharma is an Automation Tester";
        int vowelCount = 0;
        int blankChar = 0;
        String inputLower = input.toLowerCase();
        for (int i=0; i< input.length(); i++)
        {
            if (inputLower.charAt(i) == 'a' ||
                    inputLower.charAt(i)=='e' || inputLower.charAt(i) == 'o' ||
                    inputLower.charAt(i) == 'i' || inputLower.charAt(i) == 'u')
            {
                vowelCount++;
            } else if(inputLower.charAt(i) == ' ')
                blankChar++;
        }

        int consonantCount = inputLower.length()-(blankChar+vowelCount);
        System.out.println("Length" + inputLower.length());
        System.out.println("Vowels: " + vowelCount);
        System.out.println("Consonant : " + consonantCount);

    }
}
