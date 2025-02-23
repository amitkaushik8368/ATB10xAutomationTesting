package ConceptBuilding.CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListCollection
{
    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();
        list.add("Amit");
        list.add("Sharma");
        list.add(1);
        list.add(5);
        list.add(1);

        Iterator<Object> elements = list.iterator();
        for (int i = 0; i<list.size()-2; i++)
            System.out.println(elements.next());

        System.out.println("__________");

        while (elements.hasNext())
            System.out.println(elements.next());

        System.out.println("___________");

        System.out.println(list.get(3));
    }
}
