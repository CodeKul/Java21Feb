package collectionframework;

import java.util.TreeMap;

public class TreeMapDemo {

    public static void main(String[] args) {

        TreeMap<Integer,String> treeMap = new TreeMap<>();
        treeMap.put(1,"Pune");
        treeMap.put(2,"Sangli");
        treeMap.put(3,"Satara");
        treeMap.put(4,"Kolhapur");
        treeMap.put(5,"Nashik");

        System.out.println(treeMap);
        System.out.println(treeMap.subMap(2,4));
        System.out.println(treeMap.descendingMap());
        System.out.println(treeMap.descendingKeySet());
        System.out.println(treeMap.floorKey(6));
        System.out.println(treeMap.ceilingKey(6));
        System.out.println(treeMap.ceilingEntry(6));
        System.out.println(treeMap.floorEntry(6));
        System.out.println(treeMap.higherKey(4));
        System.out.println(treeMap.higherEntry(4));
        System.out.println(treeMap.firstKey());
    }
}
