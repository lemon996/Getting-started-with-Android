package U5_Java多线程;

class ThreadTest2 extends Thread {
    @Override
    public void run() {
        for(int i = 1; i <= 10; ++i) {
            System.out.println(getName() + "正在运行");
        }
    }
}

public class T3_9_线程的优先级 {
    public static void main(String[] args) {
        int mainPriority = Thread.currentThread().getPriority();
        System.out.println("主线程的优先级: " + mainPriority);
        ThreadTest2 t1 = new ThreadTest2();
        ThreadTest2 t2 = new ThreadTest2();
//        threadTest2.setPriority(10);
        t2.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        System.out.println(t1.getName() + "线程的优先级: " + mainPriority);
        System.out.println(t2.getName() + "线程的优先级: " + mainPriority);
    }
}
