package U5_Java多线程;

class PrintRunnable implements Runnable {
    private int i = 1;
    @Override
    // 随机性
    public void run() {
        while(i <= 10)
            System.out.println(Thread.currentThread().getName() + "正在运行" + i++);
    }
}

public class T2_6_通过Runnable接口创建线程 {
    public static void main(String[] args) {
        PrintRunnable pr1 = new PrintRunnable();
        Thread t1 = new Thread(pr1);
        t1.start();
//        PrintRunnable pr2 = new PrintRunnable();
        Thread t2 = new Thread(pr1);
        t2.start();
    }
}
