package JavaPracticeJan26_31;

import java.util.HashMap;
import java.util.Map;

//Program to find if a number is positive or negative
public class NegativePositiveNumber {
    public static void main(String[] args) {
        int number = -10;
        System.out.println(number <= 0 ? "Negative" : "Positive");
    }

    public static class JavaLab_018
    {
        public static void main(String[] args) {






        }

    }

    public static class Interview {

    }

    public static class HelloWorld {
        public static void main(String[] args)
        {
            System.out.println("Hello World");
        }
    }

    public static class April03
    {
        public static void main(String[] args)
        {

            String str = "Java Python Program Java Python Solve Java Hypothesis";
            String[] strArray = str.split("\\s");

            Map<String, Integer> map = new HashMap<>();
            for (String s : strArray)
            {
                map.put(s, map.getOrDefault(s, 0) +1);
            }

            //map.forEach((k, v) -> System.out.println(k + " " + v));

            for (var st : map.entrySet())
            {
                System.out.println(st.getKey() + " " + st.getValue());
            }

            var age = 0.2F;

            System.out.println(age);

        }
    }
}
