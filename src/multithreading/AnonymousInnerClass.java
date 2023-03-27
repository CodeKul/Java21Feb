package multithreading;

public class AnonymousInnerClass {

    public static void main(String[] args) {
        MyInterface myInterface = ()-> {
                return 10;
        };

        System.out.println(myInterface.show());
//        System.out.println(myInterface.display());


    }
}

interface MyInterface{

    int show();

}