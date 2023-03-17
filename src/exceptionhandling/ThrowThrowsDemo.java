package exceptionhandling;

public class ThrowThrowsDemo {

    public static void main(String[] args) throws Exception{

        int i=10;
        if(i>=18){
            System.out.println("You can vote");
        }else {
            throw new MyException("You cannot vote");
        }

        System.out.println("Exit");

    }
}

class MyException extends Exception{

    MyException(String str){
        super(str);
    }

}
/**
 *            throw                                          throws
 *
 * 1. throw is used to throw the exception explicitly   1. declare exception
 *
 * 2. throw is used in method                           2. throws is used with method signature
 *
 * 3. you can throw only one exception at a time        3. you can declare multiple exception at a time
 *
 * 4. throw is used with instance of class              4. throws is used with class
 *
 *
 */