package collectionframework;

import java.util.TreeSet;

public class TreeSetDemo {

    public static void main(String[] args) {

        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(10);
        treeSet.add(12);
        treeSet.add(13);
        treeSet.add(14);
        treeSet.add(15);

//        System.out.println(treeSet);
//        System.out.println(treeSet.subSet(20,50));
//        System.out.println(treeSet.descendingSet());
        System.out.println(treeSet.ceiling(8));
        System.out.println(treeSet.floor(20));
        System.out.println(treeSet.higher(11));
        System.out.println(treeSet.lower(11));
        System.out.println(treeSet.headSet(14,false));
        System.out.println(treeSet.tailSet(11,true));
        System.out.println(treeSet.first());
        System.out.println(treeSet.last());
    }
}
