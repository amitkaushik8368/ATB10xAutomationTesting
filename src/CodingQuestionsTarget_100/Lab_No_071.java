package CodingQuestionsTarget_100;

import javax.print.DocFlavor;
import java.util.Arrays;

public class Lab_No_071
{
    public static void main(String[] args) {

        String name = "Amit Sharma";
        char[] nameArray = name.toCharArray();

        int[] array = {1, 2, 3, 4};

        String s1 = Arrays.toString(array);
        System.out.println(s1);

        String s = Arrays.toString(nameArray);
        System.out.println(s);

        StringBuilder stringBuilder = new StringBuilder(Arrays.toString(nameArray));
        System.out.println(stringBuilder);


    }
}
