package ConceptBuilding.CollectionFramework;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapCollection
{
    public static void main(String[] args) {
        Map map = new TreeMap();

        map.put(3, "Amit");
        map.put(2, "Sharma");
        map.put(1, "Pratima");
        map.put(3, "Mamta");
        System.out.println(map);

    }
}
