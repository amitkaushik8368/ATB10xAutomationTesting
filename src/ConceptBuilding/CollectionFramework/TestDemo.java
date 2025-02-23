package ConceptBuilding.CollectionFramework;

import java.lang.reflect.Array;
import java.util.*;

public class TestDemo
{
    public static void main(String[] args) {
        List l = List.of("Mango", "Banana");
        List<Integer> l1 = new ArrayList<>();
        Iterator iterator = l.iterator();
       //l.add("Cherry");    not allowed

        for (Object o : l)
        {
            System.out.println(o);
        }

    }

}

/*
public class ArrayList<E> extends AbstractList<E> implements List<E>
public class LinkedList<E> extends AbstractSequentialList<E> implements List<E>, Deque<E>
public class Stack<E> extends Vector<E>
public class Vector<E> extends AbstractList<E> implements List<E>,
 */


/*
public class HashSet<E> extends AbstractSet<E>  implements Set<E>
 */



