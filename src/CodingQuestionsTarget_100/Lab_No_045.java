package CodingQuestionsTarget_100;

import java.util.Arrays;

public class Lab_No_045
{
    public static void main(String[] args) {

        /*
        String “GoodMorningGoodAfternoonGoodNight”

        output = “GoodMorningGoodAfternoonBadNight”
         */

        String input = "GoodMorningGoodAfternoonGoodNight";
        //String output = "GoodMorningGoodAfternoon Bad Night";  Replace third Good with Bad
        String[] inputArray = input.split("Good");
        System.out.println(Arrays.toString(inputArray));
        int count = 0;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i=0;i<input.length(); i++)
        {
            if (input.charAt(i) == 'G')
            {
                count++;
                if (count == 3)
                {
                    stringBuilder.append("Bad");
                    i = i+3;
                    continue;
                }
            }
            stringBuilder.append(input.charAt(i));
        }
        System.out.println(stringBuilder);

    }
}
