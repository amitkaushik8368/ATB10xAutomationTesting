package CodingQuestionsTarget_100;

import java.util.*;

public class LabNo_036
{
    public static void main(String[] args) {
        String[] input = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<String> groupAna = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for (String str : input)
        {
            char[] chStr = str.toCharArray();
            Arrays.sort(chStr);
            String str1 = Arrays.toString(chStr);
            //map.put(str1, map.getOrDefault(str1, Collections.singletonList(str)) + groupAna.add(str))

        }




    }
}
