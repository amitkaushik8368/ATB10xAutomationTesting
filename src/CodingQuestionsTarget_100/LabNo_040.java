package CodingQuestionsTarget_100;

import java.util.Arrays;

public class LabNo_040
{
    public static void main(String[] args) {
        int[] array = {0, 1, 0, 3, 12, 0};
        long countZero = Arrays.stream(array).filter(n->n==0).count();

        int i = 0;
        while(i<countZero)
        {
            for (int j = 0; j< array.length-1-i; j++)
            {
                if (array[j] == 0){
                    array[j] = array[j+1];
                    array[array.length-1] = 0;
                    break;
                }
            }
            i++;

        }
        System.out.println(Arrays.toString(array));
    }
}
