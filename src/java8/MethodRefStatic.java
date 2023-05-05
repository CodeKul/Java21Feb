package java8;

public class MethodRefStatic {

//    method ref to static method
    public static void main(String[] args) {
        MyInterface5 myInterface5 = MethodRefStatic::display;
        myInterface5.show();

    }

    public static void display(){
        System.out.println("in display");
    }
}

interface MyInterface5{

    void show();
}