package abstraction.interfacedemo;

import encapsulation.EncapsulationDemo;

public class Football implements Sports{

    public void show() {
        System.out.println("in show");
    }

    public static void main(String[] args) {

        Football obj = new Football();
        obj.show();

        EncapsulationDemo obj1 = new EncapsulationDemo();

    }

}
