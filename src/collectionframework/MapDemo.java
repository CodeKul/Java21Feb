package collectionframework;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapDemo {

    public static void main(String[] args) {

        Map<Integer,String> map = new HashMap<>();

        map.put(1,"Pune");
        map.put(2,"Mumbai");
        map.put(3,"Nashik");

        Map<Integer,String> map1 = new HashMap<>();

        map1.put(1,"Pune");
        map1.put(2,"Mumbai");
        map1.put(3,"Nashik");

        Map<Integer,String> map2 = new HashMap<>();

        map2.put(1,"Pune");
        map2.put(2,"Mumbai");
        map2.put(3,"Nashik");

        List<Map<Integer,String>> list = Arrays.asList(map1,map,map2);

        list.forEach(s->{
            s.forEach((k,v)->{
                System.out.println("Key->"+k +" Value->"+v);
            });
        });

//        System.out.println(map);
//
//        map.forEach((k,v)->{
//            System.out.println("Key->"+k +" Value->"+v);
//        });
//
//        for(Map.Entry<Integer,String> m:map.entrySet()){
//            System.out.println(m.getKey()+" "+m.getValue());
//        }
    }

}
