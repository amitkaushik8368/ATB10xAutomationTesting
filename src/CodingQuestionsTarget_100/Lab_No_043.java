package CodingQuestionsTarget_100;

import java.util.HashSet;
import java.util.Set;

public class Lab_No_043
{
    public static void main(String[] args) {
        int[] arr1 = {4, 5, 6, 3, 5, 2, 4, 1};
        Set<Integer> set = new HashSet<>();
        for (int num: arr1)
        {
            if (!set.add(num))
            {
                System.out.println("First Duplicate: " + num);
                return;
            }
        }
        System.out.println(-1);
    }
}
