package CodingQuestionsTarget_100;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Lab_No_054
{
    public static void main(String[] args) {

        LocalTime localTime = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH_mm_ss");
        String timeString = localTime.format(formatter);
        System.out.println(localTime);
        System.out.println(timeString);

    }
}
