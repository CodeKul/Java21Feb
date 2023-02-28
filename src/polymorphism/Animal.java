package polymorphism;

/**
 * method overriding -> if two classes have same method with same signature
 * <p>
 * advantage - we are again implementing parent class method in child
 */
public class Animal {
    //run time polymorphism,dynamic binding ,late binding
    public void sound() {
        System.out.println("in Animal sound");
    }
}

class Cat extends Animal {

    public static void main(String[] args) {

//        Cat obj = new Cat();
//        obj.sound();

        Animal obj2 = new Cat();
        //reference    //object
        obj2.sound();
    }

    public void sound() {
        System.out.println("In cat sound");
    }
}
