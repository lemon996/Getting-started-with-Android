package U5_Java多线程.T5_1_进程间通信;

public class Queue {
    private int n;
    private boolean flag = false;

    public synchronized int getN() {
        if(!flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        flag = false;
        notifyAll();
        System.out.println("消费：" + n);
        return n;
    }

    public synchronized void setN(int n) {
        if(flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        flag = true;
        notifyAll();
        System.out.println("生产：" + n);
        this.n = n;
    }
}
