package CodingQuestionsTarget_100;

import java.util.HashMap;
import java.util.Map;

public class Lab_089
{
    public static void main(String[] args) {

       /*
       Write the java program to find the most frequently occurring word in a paragraph
        */

        String string = "This is the practice being done to become master in the automation testing domain," +
                " the journey is a bit difficult but it will surely be interesting. This is actually a fun";
        String [] strings = string.split(" ");
        Map<String, Integer> map = new HashMap<>();

        for(String word: strings)
        {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }



        int greatValue = 0;
        String freqOccur = null;

        for (var str : map.keySet())
        {
            if (map.get(str)> greatValue)
            {
                freqOccur= str;
                greatValue = map.get(str);
            }
        }
        System.out.println("Word '" + freqOccur + "' has occurred " + map.get(freqOccur) + " times" );

    }
}
