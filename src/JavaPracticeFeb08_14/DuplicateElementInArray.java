package JavaPracticeFeb08_14;
//Program to find duplicate elements inside an array

/*
Duplicate Elements using HashSet:

import java.util.HashMap;
import java.util.Map;

public class DuplicateElementWithCount {
    public static void main(String[] args) {
        int[] array = {32, 43, 12, 54, 34, 32, 54, 32, 87, 54, 45, 45, 45, 43};

        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (int num : array) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Print elements that appear more than once
        System.out.println("Duplicate Elements with Frequency:");
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " -> " + entry.getValue());
            }
        }
    }
}
 */

import java.util.ArrayList;
import java.util.Arrays;

public class DuplicateElementInArray {
    public static void main(String[] args) {
        int[] array = {32, 43, 12, 54, 34, 32, 54, 32, 87, 54, 45,45,45,43};
        ArrayList<Integer> duplicate = new ArrayList<>();
        boolean[] processed = new boolean[array.length];
        for (int i = 0 ; i<array.length; i++)
        {
            boolean check = false;
            if (processed[i]) continue;
            for (int j = i+1; j < array.length; j++)
            {
                if (array[i] == array[j])
                {
                    check = true;
                    processed[j] = true;
                }
            }
            if (check) duplicate.add(array[i]);
        }
        System.out.println("Duplicate Elements: " + duplicate);

    }

}
