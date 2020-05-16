package U5_Java多线程;

class ThreadTest1 implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 30; i++) {
            System.out.println(Thread.currentThread().getName() + "执行第" + i + "次！");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class T3_3_sleep方法 {
    public static void main(String[] args) {
        ThreadTest1 test1 = new ThreadTest1();
        Thread thread = new Thread(test1);
        thread.start();
        Thread thread1 = new Thread(test1);
        thread1.start();
    }
}
