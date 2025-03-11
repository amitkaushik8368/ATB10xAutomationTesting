package LogicBuilding.March08_11;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepititiveLinkedHashMap
{

    public static void main(String[] args) {

        String input = "namanbcawfbkamjacwfkjo";
        Map<Character, Integer> charFrequency= new LinkedHashMap<Character, Integer>();

        for (char ch:input.toCharArray())
        {
            charFrequency.put(ch, charFrequency.getOrDefault(ch, 0)+1);
        }
       // System.out.println(charFrequency);


        for (char c : input.toCharArray())
        {
            if(charFrequency.get(c) == 1)
            {
                System.out.println(c);
                return;
            }
        }






    }


}
