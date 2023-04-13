package collectionframework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArraylistMethods {
    public static void main(String[] args) {

        var arraylistMethods = new ArraylistMethods();

        List<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(46);
        list1.add(46);


//        System.out.println(list1.get(1));
//        System.out.println(list1.contains(10));
//        System.out.println(list1.hashCode());
//        System.out.println(list1.indexOf(30));
//        System.out.println(list1.isEmpty());
//        System.out.println(list1.subList(1,4));

//        list1.clear();
        List<Integer> list2 = new ArrayList<>();
        list2.add(10);
        list2.add(20);
        list2.add(30);
        list2.add(40);

//        String str = "Pune";
//        System.out.println(str.hashCode());
//        list1.addAll(list2);
//        list1.removeAll(list2);
//        list1.retainAll(list2);

//        System.out.println(list1.containsAll(list2));
//        System.out.println(list1.equals(list2));

        List<List<Integer>> list = new ArrayList<>();
        list.add(list1);
        list.add(list2);

        System.out.println(list);

        List<Object> list3 = new ArrayList<Object>();
        list3.add("Pune");
        list3.add(9);
        list3.add(false);

        System.out.println();
        List<Integer> list4 = Arrays.asList(1,2,3,4,5);
        List<Integer> list5 = Arrays.asList(1,2,3,4,5);

        for(int i=0,j=list5.size()-1;i<list4.size();i++,j--){
            System.out.println(list4.get(i)*list5.get(j));
        }

        Iterator<Integer> iterator = list1.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}

//1,2,3,4,5 -list1
//1,2,3,4,5 -list2
