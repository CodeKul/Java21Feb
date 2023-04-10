package collectionframework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

    public static void main(String[] args) {

        long[] arr = new long[10];


        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println(list);

        for (Integer integer : list) {
            System.out.println(integer);
        }

        list.forEach(s->{
            System.out.println(s);
        });

        for(int i=0;i< list.size();i++){
            System.out.println(list.get(i));
        }

        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        List<Integer> list1 = new ArrayList<>();

        List<Integer> list2 = Arrays.asList(1,2,3,4,5);

        List<Integer> list3 = new ArrayList<>(Arrays.asList(1,2,3,4,5));

        List<Integer> list4 = new ArrayList<>(List.of(1,2,3,4));
        List<Integer> list5 = new ArrayList<>(){{add(10);add(20);}};

        List<Integer> list6 = List.of(1,2,3,4);
        System.out.println(list6);

    }
}
