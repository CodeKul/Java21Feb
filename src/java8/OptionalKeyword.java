package java8;

import java.util.Optional;

public class OptionalKeyword {
    public static void main(String[] args) {

        Student student = new Student(1,"Akash");
        if(student.getName() != null){
            System.out.println(student.getName().toLowerCase());
        }else {
            System.out.println("name is null");
        }
//
//        Optional<String> optional = Optional.empty();
//        System.out.println(optional);

//        Optional<String> optional1 = Optional.of(student.getName());
//        System.out.println(optional1);

        Optional<String> optional2 = Optional.ofNullable(student.getName());
        if(optional2.isPresent()){
            System.out.println(optional2.get());
        }else {
            System.out.println("null value");
        }
    }
}

class Student{


    int id;

    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
