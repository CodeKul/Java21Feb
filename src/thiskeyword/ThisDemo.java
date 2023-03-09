package thiskeyword;

import statickeyword.StaticDemo;

/**
 * 1 .this keyword is used to refer current class instance variable
 * 2. this keyword is used to invoke current class methods
 * 3. this keyword is used to invoke current class constructor
 * 4. this keyword is used to pass argument in method call
 * 5. this keyword is used to return as an object
 */
public class ThisDemo {

    int id;

    String name;

    String address;

    public void show(int id,String name,String address){
        this.id = id;
    }

    public void display(){
        this.show(1,"Prakash","Pune");
    }
    public ThisDemo(int id,String name,String address){
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public ThisDemo(){
        this(1,"Rahul","Pune");
        show(1,"Rahul","Pune");
    }
    public void test(A a){
        System.out.println("In test method");
    }
    public static void main(String[] args) {


        StaticDemo.show();

        ThisDemo obj = new ThisDemo(1,"Rahul","Pune");

        System.out.println(obj.id+" "+obj.name+" "+obj.address);
    }
}

class A{

    public void test2(){

        ThisDemo obj = new ThisDemo();

        obj.test(this);
    }

    public A test3(){
        return this;
    }
    public static void main(String[] args) {

        A obj = new A();
        obj.test2();
    }

}