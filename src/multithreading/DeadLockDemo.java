package multithreading;

public class DeadLockDemo {


    public static void main(String[] args) {

        String resource1 = "Printer";
        String resource2 = "Scanner";

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (resource1) {
                    System.out.println(Thread.currentThread().getName() +
                            " Locked :" + resource1);

                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    synchronized (resource2) {
                        System.out.println(Thread.currentThread().getName() + " Locked :" + resource2);
                    }
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (resource2) {
                    System.out.println(Thread.currentThread().getName() +
                            " Locked :" + resource2);

                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                synchronized (resource1) {
                    System.out.println(Thread.currentThread().getName() +
                            " Locked :" + resource1);
                }
            }
        });

        t1.setName("Laptop");
        t2.setName("Desktop");

        t1.start();
        t2.start();
    }
}
