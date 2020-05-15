package U5_Java多线程;

class PriterThread extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 10; ++i) {
            System.out.println("打印机正在打印" + i);
        }
    }
}

public class T2_5_打印机 {
    public static void main(String[] args) {
        PriterThread priterThread = new PriterThread();
        priterThread.start();
    }
}
