package LogicBuilding.Feb22_28;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveStringDuplicateThroughHashSet
{
    public static void main(String[] args) {
        String input = "hippopotamus";
        Set<Character> set = new HashSet<>();
        StringBuilder stringBuilder = new StringBuilder();
        for (char c : input.toCharArray())
        {
            if(set.add(c))
                stringBuilder.append(c);
        }
        System.out.println(stringBuilder);
    }
}
//        System.out.println(set);
//        for (Character s: set)
//        {
//            stringBuilder.append(s);
//        }

