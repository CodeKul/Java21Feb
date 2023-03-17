package exceptionhandling;

import java.io.IOException;

public class MethodOverriding {

    public void show()throws RuntimeException {
        System.out.println("In show");
    }
}

class MethodOverriding1 extends MethodOverriding{
    public void show() //throws Exception
    {
        System.out.println("In show");
    }
}

//if parent class method declare no exception then child class method can declare only unchecked exception
//if parent class method declare exception then child class method can declare same exception
//if parent class method declare exception then child class method can declare child exception
