package CodingQuestionsTarget_100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Lab_No_059
{
    public static void main(String[] args) {

        List<String> list = new ArrayList<>(Arrays.asList("Suresh", "Ramesh", "Chetan", "Ganesh", "Bhupesh"));
        Collections.sort(list);
        System.out.println(list);
    }
}
