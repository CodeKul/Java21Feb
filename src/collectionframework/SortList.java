package collectionframework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortList {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(150);
        list.add(207);
        list.add(3430);
        list.add(460);

        Collections.sort(list, Comparator.reverseOrder());
        System.out.println(list);
    }
}
