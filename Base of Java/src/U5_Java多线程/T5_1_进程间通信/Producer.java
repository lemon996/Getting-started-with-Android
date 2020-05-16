package U5_Java多线程.T5_1_进程间通信;

public class Producer implements Runnable{
    private Queue queue;

    public Producer(Queue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        int i = 0;
        while (true) {
            queue.setN(i++);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
