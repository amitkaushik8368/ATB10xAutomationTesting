package JavaPracticeFeb08_14;

import java.util.Arrays;

public class ReverseAString3 {
    public static void main(String[] args) {
        String input = "I love my Wife";
        char[] array = input.toCharArray();
        System.out.println(Arrays.toString(array));
        int left = 0, right = array.length-1;
        while (left<right)
        {
            char temp;
            temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
        System.out.println(String.valueOf(array));
    }
}
