package JavaPracticeFeb15_21;

import java.util.HashMap;
import java.util.Map;

public class CountVowelsAndConsonants
{
    public static void main(String[] args)
    {
        String str = "amit sharma is an automation tester";
        //Program to find the count of vowels and consonants
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (char c: str.toCharArray())
        {
            if (c == ' ') continue;
            else
                hashMap.put(c, hashMap.getOrDefault(c, 0) + 1);
        }
        int vowelCount =0;
        int consnantCount = 0;
        System.out.println(hashMap.entrySet());
        for (int i = 0; i<hashMap.size(); i++){
            Map.Entry<Character, Integer> entry = hashMap.entrySet().iterator().next();
            System.out.println(entry);
        }



        for (char ch: hashMap.keySet())
        {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            {
                vowelCount = vowelCount + hashMap.get(ch);
            } else
                consnantCount = consnantCount + hashMap.get(ch);
        }

        System.out.println("Vowels count : " + vowelCount+ " Consonant Count : " + consnantCount);



    }
}
