package multithreading;

public class SynchronizedDemo {

    static int num;

    public void increment(){
        synchronized (SynchronizedDemo.class){
            num++;
        }
    }

    public static void main(String[] args) throws InterruptedException {

        SynchronizedDemo obj=  new SynchronizedDemo();

        SynchronizedDemo obj1 = new SynchronizedDemo();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=1;i<=1000;i++){
                    obj.increment();
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=1;i<=1000;i++){
                    obj1.increment();
                }
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println("num=> "+num);

    }
}
