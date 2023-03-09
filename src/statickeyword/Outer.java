package statickeyword;

public class Outer {

    int i = 10;
     static class Inner {
        int i = 20;
    }
    public static void main(String[] args) {
        Outer outer = new Outer();
        System.out.println(outer.i);

//        Inner inner = new Outer().new Inner();

//        System.out.println(inner.i);

        Outer.Inner inner = new Inner();
        System.out.println(inner.i);

//
//        System.out.println(Inner.i);

    }


}
