package multithreading;

public class ProducerConsumer {

    int num;
    public void getNum() {
        System.out.println("Get: " + num);
    }

    public void setNum(int num) {
        this.num = num;
        System.out.println("Set: " + num);
    }
}

class Producer implements Runnable {

    ProducerConsumer producerConsumer;
    public Producer(ProducerConsumer producerConsumer) {
        this.producerConsumer = producerConsumer;
        Thread t1 = new Thread(this);
        t1.start();
    }
    @Override
    public void run() {
        int i = 1;

        while (true) {
            producerConsumer.setNum(i++);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class Consumer implements Runnable{

    ProducerConsumer producerConsumer;
    public Consumer(ProducerConsumer producerConsumer) {
        this.producerConsumer = producerConsumer;
        Thread t1 = new Thread(this);
        t1.start();
    }

    @Override
    public void run() {

        while (true){
            producerConsumer.getNum();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class Main{
    public static void main(String[] args) {
        ProducerConsumer producerConsumer = new ProducerConsumer();
        Producer producer = new Producer(producerConsumer);
        Consumer consumer = new Consumer(producerConsumer);
    }
}