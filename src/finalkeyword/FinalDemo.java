package finalkeyword;

/**
 * 1. if you declare final variable then you cannot reassign value
 * 2. if you declare final method then you cannot override the method
 * 3. if you declare final class then you cannot inherit that class
 */

public  class FinalDemo {

    final int TEST =10;

    class A{

    }
    public final void display(){
//        TEST = 35;
        System.out.println(TEST);
    }

    public static void main(String[] args) {

        FinalDemo obj = new FinalDemo();
        obj.display();
        System.out.println(obj.TEST);

    }
}

class C extends FinalDemo {

//    @Override
//    public void display() {
//        super.display();
//
//    }
}