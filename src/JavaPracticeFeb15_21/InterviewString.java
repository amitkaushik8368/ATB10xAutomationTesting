package JavaPracticeFeb15_21;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class InterviewString
{
    public static void main(String[] args) {
        String str = "I will definitely take the new Job";
        String lowerStr = str.toLowerCase();
        usingNestedForLoop(lowerStr);
        usingHashmap(lowerStr);

        /*
        input = "Amit is a Tester"
        output = "2123 22 2 322321"
         */




    }

    static void usingHashmap(String str)
    //str = "amit is an automation tester";
    {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        char[] chars = str.toCharArray();
        for (char ch : chars)
        {
            if (ch == ' ') continue;
            hashMap.put(ch, hashMap.getOrDefault(ch,0) +1 );
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (char c:chars)
        {
            if(c == ' ')
                stringBuilder.append(" ");
            else
                stringBuilder.append(hashMap.get(c));
        }
        System.out.println(stringBuilder);
//        ArrayList<String> resultString = new ArrayList<>();
//        for (char c:chars)
//        {
//            resultString.add(hashMap.get(c));
//        }
    }






    static void usingNestedForLoop(String str)
    //  str = "amit is a tester";
    {
        int x = 10;
        boolean[] dupCharProcessed = new boolean[str.length()];
        for (int i = 0; i < str.length(); i++)
        {
            if (dupCharProcessed[i] || str.charAt(i) == ' ') continue;
            char count = '1';
            for (int j = i+1; j < str.length(); j++)
            {
                if (str.charAt(i) == str.charAt(j))
                {
                    count++;
                    dupCharProcessed[j] = true;
                }
            }
            str = str.replace(str.charAt(i), count);

        }
        System.out.println(str);



    }
}
