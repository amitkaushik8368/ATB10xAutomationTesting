package JavaPracticeFeb15_21;

import java.util.HashMap;

public class UnderstandingHashmap
{
    public static void main(String[] args)
    {
        HashMap<Integer, String> names = new HashMap<>();
        names.put(1,"Amit Sharma");
        names.put(2, "Mamta Rani");
        names.put(3, "Pratima Kaushik");



        System.out.println(names);
        System.out.println(names.get(3));
        System.out.println(names.containsKey(4));
        System.out.println(names.containsValue("Pratima Kaushik"));

    }
}
