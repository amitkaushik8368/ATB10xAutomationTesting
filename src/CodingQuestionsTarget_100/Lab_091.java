package CodingQuestionsTarget_100;

import java.util.Arrays;
import java.util.Locale;

public class Lab_091
{
    public static void main(String[] args)
    {
        String str = "You are good person you should be proud of yourself";
        StringBuilder stringBuilder = new StringBuilder();

        String[] strArray = str.split("\\s+");
        System.out.println(strArray.length);
        for (String s: strArray)
        {
            if (s.equalsIgnoreCase("you"))
            {
                String x = s.toUpperCase();
               // System.out.println(x);
                stringBuilder.append(x).append(" ");
            } else stringBuilder.append(s).append(" ");
        }
        System.out.println(stringBuilder);

    }
}
