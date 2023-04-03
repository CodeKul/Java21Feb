package multithreading;

public class ThreadMethods {

    public static void main(String[] args) {

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().isAlive());

                System.out.println("In run method 1");
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("In run method 2");
            }
        });

        t1.setName("Laptop");
        System.out.println(t1.getName());

        t1.setPriority(1);
        t2.setPriority(Thread.MAX_PRIORITY);
        System.out.println(t1.isAlive());
        t1.setDaemon(true);
        System.out.println("is daemon "+t1.isDaemon());

        t1.start();
        t2.start();

    }
}
