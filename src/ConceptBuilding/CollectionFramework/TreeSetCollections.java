package ConceptBuilding.CollectionFramework;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetCollections
{
    public static void main(String[] args) {
        Set set = new TreeSet();

        set.add("Amit");
        set.add("Sharma");
        set.add("Mohit");
        try {
            set.add(23);
        } catch (Exception e) {
            System.out.println("This is an exception " + e.getMessage());
        }
        System.out.println(set);   //Output will be in sorting order

    }
}
