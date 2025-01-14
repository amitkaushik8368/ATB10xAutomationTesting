package JavaPracticeJan11_17;


import java.util.Arrays;

public class ArrayLab003 {
    public static void main(String[] args) {
        int[] array = {4, 6, 2, 8, 12, 2, 6, 6, 6};
        boolean[] decide = new boolean[array.length];
        int[] duplicate = new int[array.length];
        for (int i = 0; i<array.length;i++){
            if (decide[i]) continue;
            for (int j =i+1; j< array.length; j++){
                if (array[i] == array[j]){
                    duplicate[i] = array[i];
                    decide[j] = true;

                }
            }
        }
        System.out.println(Arrays.toString(duplicate));
        System.out.println(Arrays.toString(decide));
    }
}
