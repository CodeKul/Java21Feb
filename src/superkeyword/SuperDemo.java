package superkeyword;

/**
 * super - it is used to refer immediate parent class variable
 *         it is used to invoke immediate parent class method
 *         it is used to invoke parent class constructor
 */
public class SuperDemo extends Object {

    int i=10;

    public void show(){
        System.out.println("In show");
    }

    public SuperDemo(){
        System.out.println("In Super demo const");
    }
    public SuperDemo(int i){

        System.out.println("In Super demo parameter const");
    }
}
class A extends SuperDemo{

    int i=20;
    public void display(){
        System.out.println(super.i);
        System.out.println(i);
        super.show();
    }

    public A(){
        super();
        System.out.println("In A const");
    }
    public static void main(String[] args) {
        A obj = new A();
        obj.i = 45;
        obj.display();
    }
}

class B extends A{

    int i =30;

    public void show(){
        System.out.println(super.i);
    }
    public static void main(String[] args) {

        B obj  =new B();
       obj.show();
    }
}