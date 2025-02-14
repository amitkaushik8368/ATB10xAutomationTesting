package JavaPracticeFeb08_14;

import java.util.Arrays;

/*
program to reverse an array without using another array
 */
public class ReverseAnArrayWithoutAnotherArray {
    public static void main(String[] args) {
        int[] array = {23, 12, 43, 54, 27, 87, 67};
        int begin = 0, end = array.length-1;
        while (begin<end){
            int temp = array[begin];
            array[begin++] = array[end];
            array[end--] =temp;
        }
        System.out.println(Arrays.toString(array));
    }
}
