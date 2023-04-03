package multithreading;

public class InteruptDemo {


    public static void main(String[] args) {

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                for(int i=1;i<50;i++){
                    System.out.println("In thread 1");
                }
            }
        });

        t1.start();
        t1.interrupt();
        System.out.println(t1.isInterrupted());
        System.out.println("In main thread");
    }
}
