package Interview;

import java.util.*;

public class April_25
{
    public static void main(String[] args) {

        /*
        String name1="suresh vemula";

        output = Suresh Vemula
         */
        String name1 = "suresh vemula";

        Character[] characters = new Character[name1.length()];

        for (int i=0; i< name1.length(); i++)
        {
            characters[i] = name1.charAt(i);
        }



        Set<Character> set = new LinkedHashSet<>();

        for (Character ch : characters)
        {
            set.add(ch);
        }
        System.out.println(set);



/*
        String[] strArray = name1.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        for (String str: strArray)
        {
            char[] charArray = str.toCharArray();

            charArray[0] = Character.toUpperCase(charArray[0]);

            String str1 = String.valueOf(charArray);

            stringBuilder.append(str1).append(" ");
        }
        String output = stringBuilder.toString().trim();
        System.out.println(output);
*/
    }
}
