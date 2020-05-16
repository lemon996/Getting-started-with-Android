package U5_Java多线程.T5_1_进程间通信;

public class Customer implements Runnable{
    private Queue queue;

    public Customer(Queue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        int i = 0;
        while (true) {
            queue.getN();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
