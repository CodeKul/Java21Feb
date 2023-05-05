package java8;

import java.util.Arrays;
import java.util.List;

public class MethodRef {

    //method ref to arbitrary type of particular object
    public static void main(String[] args) {

        List<Student> list = Arrays.asList(new Student(1,"Ramesh"),new Student(2,"Sahil"));

        list.forEach(System.out::println);

        list.forEach(Student::getName);

    }

    static class Student {

        private int id;
        private String name;

        @Override
        public String toString() {
            return "Student{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }

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

        public void getName() {
            System.out.println("Name=>"+this.name);
        }

        public void setName(String name) {
            this.name = name;
        }
    }

}
