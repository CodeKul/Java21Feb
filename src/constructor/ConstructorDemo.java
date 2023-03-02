package constructor;

/**
 * constructor -> it is special type function
 *              which invoke automatically when you create
 *              object of class
 * Rules ->
 *  1. you class name and constructor should be same
 *  2. there should not be explicit return type to constructor
 *  3. static, synchronized,final keywords are not allowed
 *
 *  types ->
 *  1. default
 *  2. parameter
 *
 *  use - initialize variables to their default values
 */
public class ConstructorDemo {

    int id;
    String name;

    public void show(){

    }

    public ConstructorDemo(){
        System.out.println("In constructor");
    }

    public ConstructorDemo(int i){
        System.out.println("in parameter const "+i);
    }
    public static void main(String[] args) {

        ConstructorDemo obj = new ConstructorDemo();
        ConstructorDemo obj1 = new ConstructorDemo(2);

    }

}
