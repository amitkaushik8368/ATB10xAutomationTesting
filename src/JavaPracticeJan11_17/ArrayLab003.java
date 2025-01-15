package JavaPracticeJan11_17;


import java.util.ArrayList;
import java.util.Arrays;

public class ArrayLab003 {
    public static void main(String[] args) {
        int[] array = {4, 6, 2, 8, 12, 2, 6, 6, 6, 12, 12, 12, 4, 4, 4, 8, 8, 8, 8, 8, 8, 8, 2, 2, 2, 2, 2, 10, 10};
        boolean[] decide = new boolean[array.length];
        int[] duplicate = new int[array.length];
        ArrayList<Integer> duplicateList = new ArrayList<>();
        //System.out.println(duplicateList);
        for (int i = 0; i<array.length;i++){
            if (decide[i]) continue;
            int count = 0;
            for (int j =i+1; j< array.length; j++){
                if (array[i] == array[j]){
                    count++;
                    if (count ==1) duplicateList.add(array[i]);
                    decide[j] = true;

                }
            }
        }
        System.out.println(duplicateList);
        System.out.println(Arrays.toString(decide));
    }
}
