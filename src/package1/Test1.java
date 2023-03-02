package package1;

public class Test1 {

     protected int i =10;

    public static void main(String[] args) {
        Test1 obj = new Test1();
        System.out.println(obj.i);
    }
}

//public -  you can access variables/functions through out the project
//private - you can access variables/functions within class
//default - you can access variables/functions withing package only
//protected - you can access variables/functions withing package and outside the package through inheritance