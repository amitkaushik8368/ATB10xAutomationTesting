package CodingQuestionsTarget_100;

import com.sun.source.doctree.SeeTree;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Lab_No_042
{
    public static void main(String[] args) {
        Integer[] arr = {3, 7, 1, 2, 8, 4, 5}; //sequence 1 to 8

        Set<Integer> set = new HashSet<>(Arrays.asList(arr));
        for (int i=1 ; i< 9; i++)
        {
            if (!set.contains(i)){
                System.out.println(i);
            }
        }
    }
}
