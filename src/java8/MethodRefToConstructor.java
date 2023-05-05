package java8;

public class MethodRefToConstructor {

    MethodRefToConstructor(){
        System.out.println("in constructor");
    }

    public static void main(String[] args) {
        //refer
        MyInterface6 myInterface6 = MethodRefToConstructor::new;

        //calling
        myInterface6.methodRefToConstructor();

    }
}

interface MyInterface6{

    MethodRefToConstructor methodRefToConstructor();

}