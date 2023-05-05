package java8;

public class MethodRefToInstance {


//    method ref to instance method

    public static void main(String[] args) {
        MethodRefToInstance obj = new MethodRefToInstance();

        //refer
        MyInterface4 myInterface4 = obj::display;
//        calling
        myInterface4.show();

    }

    public void display(){
        System.out.println("in display");
    }
}

interface MyInterface4{

    void show();
}