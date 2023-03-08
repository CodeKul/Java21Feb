package finalkeyword;

import java.util.ArrayList;
import java.util.List;

public class FinalDemo {

    final int TEST =10;

    class A{

    }
    public void display(){
//        i = 35;
        System.out.println(TEST);
    }

    public static void main(String[] args) {

        FinalDemo obj = new FinalDemo();
        obj.display();
        System.out.println(obj.TEST);

    }
}

class C extends FinalDemo {

    @Override
    public void display() {
        super.display();
    }
}