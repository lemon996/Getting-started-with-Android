package U5_Java多线程;

class ThreadTest extends Thread {
    @Override
    public void run() {
        System.out.println(getName() + "正在执行");
    }
}

public class T3_7_join方法 {
    public static void main(String[] args) {
        ThreadTest test = new ThreadTest();
        test.start();
        try {
            test.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName());
    }
}
