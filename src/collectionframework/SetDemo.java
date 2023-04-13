package collectionframework;

import java.util.*;

public class SetDemo {
    public static void main(String[] args) {

        //set doesn't maintain insertion order
// set doesn't store duplicate values
        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(10);
        set.add(30);
        set.add(40);
//        System.out.println(set);

        List<Integer> list = new LinkedList<>(set);
//        System.out.println(list);

        Set<Integer> set1 = new LinkedHashSet<>();
        set1.add(10);
        set1.add(90);
        set1.add(60);
        set1.add(30);
        System.out.println(set1);


        System.out.println();
        Set<Integer> set2 = new TreeSet<>();
        set2.add(10);
        set2.add(90);
        set2.add(60);
        set2.add(30);
        System.out.println(set2);
    }
}
