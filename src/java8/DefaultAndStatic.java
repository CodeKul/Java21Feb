package java8;

public class DefaultAndStatic implements MyInterface2{
    public static void main(String[] args) {

        DefaultAndStatic obj = new DefaultAndStatic();

        MyInterface2.show();
    }

    @Override
    public void msg() {

    }

}

interface MyInterface2{

    void msg();

    static void show(){
        System.out.println("in show ");
    };

}