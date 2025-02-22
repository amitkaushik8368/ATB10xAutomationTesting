package LogicBuilding.Feb22_28;
//Write a Java program to parse the given string ("1hr 5min 6s 10ms") and calculate the total duration in minutes.

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringLab002
{
    public static void main(String[] args) {
        String input = "1hr 5min 6s 10ms";
        Pattern pattern = Pattern.compile("(\\d+)hr | (\\d+)min | (\\d+)s | (\\d+)ms");
        Matcher regexSolution = pattern.matcher(input);
        int hour = 0, minute = 0, second = 0, miliSecond = 0;
        while (regexSolution.find())
        {
            if (regexSolution.group(1) != null)
                hour = Integer.parseInt(regexSolution.group(1));
            if (regexSolution.group(2) != null)
                minute = Integer.parseInt(regexSolution.group(2));
            if (regexSolution.group(3) != null)
                second = Integer.parseInt(regexSolution.group(3));
            if (regexSolution.group(4) != null)
                miliSecond = Integer.parseInt(regexSolution.group(4));
        }
        System.out.println("Hours: " + hour + " Minutes: " + minute + " Seconds : " + second + " Miliseconds :  " + miliSecond);
        float timeInMinutes = (float) (hour*60 + minute + second/60.0 + miliSecond/60000.0);
        System.out.println(timeInMinutes);
    }
}
