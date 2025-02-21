package JavaPracticeFeb15_21;

import java.util.HashMap;

public class ArrayLab002 {
    public static void main(String[] args) {
        int[] input = {3, 5, 8, 1, 3, 0, 4, 8};
        /*
        Count the occurrence of each element
         */

        HashMap<Integer, Integer> elementFrequency= new HashMap<>();
        for (int num:input)
        {
            elementFrequency.put(num, elementFrequency.getOrDefault(num, 0) + 1);
        }
        for (int x: elementFrequency.keySet())
        {
            System.out.println("Frequency of " + x + " is " + elementFrequency.get(x));
        }

    }
}
