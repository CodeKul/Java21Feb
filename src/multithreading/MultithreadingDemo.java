package multithreading;

public class MultithreadingDemo {

    public static void main(String[] args) {
//        System.out.println("In main thread");
//        System.out.println(Thread.currentThread().getName());

//        Hii hii = new Hii();//new
//        //runnable
//        hii.start();//running
//
//        Hello hello = new Hello();
//        Thread t1 = new Thread(hello);
//        t1.start();
//
//        int num=10;

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 5; i++) {
                    System.out.println("Hii");
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Hello");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        t1.start();
        t2.start();
    }
}

class Hii extends Thread{

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Hii");

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class Hello implements Runnable{

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}