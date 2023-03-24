package multithreading;

public class MultithreadingDemo {

    public static void main(String[] args) {
        System.out.println("In main thread");
        System.out.println(Thread.currentThread().getName());

        Hii hii = new Hii();
        hii.start();

        Hello hello = new Hello();
        Thread t1 = new Thread(hello);
        t1.start();
    }
}

class Hii extends Thread{

    @Override
    public void run() {
        System.out.println("In run method");
        System.out.println(Thread.currentThread().getName());
    }
}

class Hello implements Runnable{

    @Override
    public void run() {
        System.out.println("In run Hello method");
        System.out.println(Thread.currentThread().getName());
    }
}