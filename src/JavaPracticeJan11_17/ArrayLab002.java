package JavaPracticeJan11_17;
/*
Java program to reverse an array
 */
import java.util.Arrays;

public class ArrayLab002 {
    public static void main(String[] args) {
        int[] arr = {5, 8, 9, 3, 4, 10, 1};
        for (int i = 0, j = arr.length-1; i<j; i++, j--){
            int temp;
            temp  = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
