package collectionframework;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class StudentDemo {

    int id;
    String name;
    String address;

    public StudentDemo(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentDemo that = (StudentDemo) o;
        return id == that.id && Objects.equals(name, that.name) && Objects.equals(address, that.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, address);
    }

    public static void main(String[] args) {

        StudentDemo obj1 = new StudentDemo(1, "Prakash", "Satara");
        StudentDemo obj2 = new StudentDemo(1, "Prakash", "Satara");
        StudentDemo obj3 = new StudentDemo(2,"Ravi","Pune");

        Set<StudentDemo> set = new HashSet<>();
        set.add(obj1);
        set.add(obj2);
        set.add(obj3);

        set.forEach(s->{
            System.out.println(s.id+" "+s.name+" "+s.address);
        });
    }
}
