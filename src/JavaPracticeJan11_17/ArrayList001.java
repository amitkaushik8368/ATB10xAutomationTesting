package JavaPracticeJan11_17;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList001 {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7};
        ArrayList<Integer> arrList = new ArrayList<>();
        for (int num:arr){
            arrList.add(num);
        }
        Collections.reverse(arrList);
        System.out.println(arrList);
    }
}
