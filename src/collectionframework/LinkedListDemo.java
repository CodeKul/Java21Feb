package collectionframework;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {

        LinkedList<Integer> list1 =new LinkedList<>();
        list1.add(10);
        list1.add(20);
        list1.add(20);
        list1.add(40);

        list1.addFirst(5);
        list1.addLast(45);
        list1.offer(60);
        list1.add(70);

//        System.out.println(list1);

        List<Integer> list2 = (List<Integer>) list1.clone();

        System.out.println(list2);

//        Iterator<Integer> iterator = list1.descendingIterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }


//        System.out.println(list1.get(1));
//        System.out.println(list1.contains(10));
//        System.out.println(list1.hashCode());
//        System.out.println(list1.indexOf(30));
//        System.out.println(list1.isEmpty());
//        System.out.println(list1.subList(1,4));
//
//        list1.clear();
//
//        List<Integer> list2 = new LinkedList<>();
//        list2.add(10);
//        list2.add(20);
//        list2.add(30);
//        list2.add(40);
//
//        String str = "Pune";
//        System.out.println(str.hashCode());
//        list1.addAll(list2);
//        list1.removeAll(list2);
//        list1.retainAll(list2);
//
//        System.out.println(list1.containsAll(list2));
//        System.out.println(list1.equals(list2));
    }
}
