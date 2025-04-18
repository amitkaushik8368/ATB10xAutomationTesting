package CodingQuestionsTarget_100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lab_No_061
{
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("Suresh", "Ramesh", "Chetan", "Ganesh", "Bhupesh"));


        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size()-(i+1); j++) {

                if (list.get(j).compareTo(list.get(j+1))>0)
                {
                    String temp = list.get(j);
                    list.set(j, list.get(j+1));
                    list.set(j+1, temp);
                }

            }

        }

        list.forEach(System.out::println);

    }


}
