package multithreading;

public class YieldDemo {

    public static void main(String[] args) {

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                Thread.yield();
                for(int i=1;i<50;i++){
                    System.out.println("In thread 1");
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {

                for(int i=1;i<50;i++){
                    System.out.println("In thread 2");
                }
            }
        });

        t1.start();
        t2.start();
    }
}
