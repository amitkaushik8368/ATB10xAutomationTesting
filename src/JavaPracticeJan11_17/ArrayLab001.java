package JavaPracticeJan11_17;

import java.util.Arrays;

/*
*Program to find maximum and minimum number from Array
 */
public class ArrayLab001 {
    public static void main(String[] args) {
        int[] array = {4, 6, 8, 23, 1, 55};
        Arrays.sort(array);
        int min = array[0];
        int max = array[array.length-1];
        System.out.printf("Maximim number %d and minimum number %d", max, min);
    }
}
