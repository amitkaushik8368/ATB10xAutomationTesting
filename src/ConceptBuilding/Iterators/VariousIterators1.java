package ConceptBuilding.Iterators;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Iterator;

public class VariousIterators1
{
    public static void main(String[] args) {


        Integer[] integer = {1, 2, 3, 4, 5, 6};
        Iterator<Integer> iterator = Arrays.stream(integer).iterator();
        System.out.println(iterator.next());
        System.out.println(iterator.next());


    }

}
