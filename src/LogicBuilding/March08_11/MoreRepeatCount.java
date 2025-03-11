package LogicBuilding.March08_11;

import javax.swing.plaf.IconUIResource;
import java.util.Arrays;

public class MoreRepeatCount
{
    public static void main(String[] args) {

        String input = "namanscnsevmcev";
        int[] alphabetFrequency = new int[26];

        for (char ch : input.toCharArray())
        {
            alphabetFrequency[ch-'a']++;
        }

        System.out.println(Arrays.toString(alphabetFrequency));

        for (char ch:input.toCharArray())
        {
            if(alphabetFrequency[ch-'a']==1)
            {
                System.out.println(ch);
                return;
            }
        }

        System.out.println("No repeating char");





    }
}
