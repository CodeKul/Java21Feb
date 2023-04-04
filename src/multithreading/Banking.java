package multithreading;

public class Banking {

    int balance = 1000000;

    private int withdraw() {
        if (balance > 550) {
            balance = balance - 550;
        } else {
            System.out.println("your balance is not sufficient");
        }
        return balance;
    }
    public static void main(String[] args) throws InterruptedException {

        Banking obj = new Banking();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=1;i<500;i++) {
                    obj.withdraw();
                }
            }
        });


        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=1;i<500;i++) {
                    obj.withdraw();
                }
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("remaining balance :"+obj.balance);
    }




}
