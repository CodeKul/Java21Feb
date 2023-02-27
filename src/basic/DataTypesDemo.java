package basic;


public class DataTypesDemo {

    int baseQuantity = 2147483647;
    long a = 2342434234234333244L;

    float f = 23424342423423423423423423234324234.0432f;
    double d = 2342434242342342343423434234323423423234324234.0432;

    char ch = 'c';
    boolean b = false;
    byte aByte = 127;
    short aShort = 32767;

    Integer integer = 232443;
    Long aLong = 2342434234234333244L;

    Float aFloat;
    Double aDouble;
    Character character;
    Short aShort1;
    Byte aByte1;
    String str = "Welcome";

    public static void show(String str) {

        System.out.println("In show function");
        System.out.println("In show function");
        System.out.println("In show function");
        System.out.println("In show function");
        System.out.println("In show function");
        System.out.println("In show function");
        System.out.println("In show function");
        System.out.println("In show function");
        System.out.println("In show function");
        System.out.println("In show function");
        System.out.println("In show function");
        System.out.println("In show function");
        System.out.println("In show function");
    }

    static public  void main(String[] args) {

        DataTypesDemo obj = new DataTypesDemo();
//        System.out.println(obj.baseQuantity);
//        Boolean aBoolean = false;
//        System.out.println(aBoolean);
//
//        String str = obj.display();
//        System.out.println(str.toUpperCase());

        String str = "";
        System.out.println(args[0]);
//        show();
    }

    private int display() {
        return 1;
    }

    private void display1(){

    }

    private String display2(){
        return "pune";
    }

    private float display3(){
        return 1.9f;
    }

    public static void main(Integer[] args) {

    }

}

/**
 * public - access specifier/access modifier
 * static - without object creation jvm can access main function
 * void - it is return type and it return nothing
 * main - identifier
 * String[] - command line argument
 * args - variable name
 */