package collectionframework;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Employee implements Comparable<ComparatorDemo>{

    int id;

    String name;

    String address;

    public Employee(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public static void main(String[] args) {

        ComparatorDemo obj1 =new ComparatorDemo(26,"Pranav","Pune");
        ComparatorDemo obj2 =new ComparatorDemo(26,"Amit","Pune");
        ComparatorDemo obj3 =new ComparatorDemo(53,"Shree","Pune");

        List<ComparatorDemo> list = new ArrayList<>();
        list.add(obj1);
        list.add(obj2);
        list.add(obj3);

//        Collections.sort(list);

        list.forEach(s->{
            System.out.println(s.id+" "+s.name+" "+s.address);
        });
    }

    @Override
    public int compareTo(@NotNull ComparatorDemo o) {
        return this.name.compareTo(o.name);
    }

//    @Override
//    public int compareTo(ComparatorDemo o) {
//       if(this.id == o.id){
//           return 0;
//       }else if(this.id>o.id){
//           return 1;
//       }else {
//           return -1;
//       }
//    }
}
