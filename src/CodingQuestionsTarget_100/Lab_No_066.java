package CodingQuestionsTarget_100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Lab_No_066
{
    //Convert the list of String to uppercase using Lambda Expression
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("Amit", "Sumit", "Pratima", "Rudra", "Mamta"));
        AtomicInteger i= new AtomicInteger();
        list.forEach(s->{
            String t = s.toUpperCase();
            list.set(i.getAndIncrement(), t);
        });
        System.out.println(list);
    }
}
