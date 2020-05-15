package U5_Java多线程;

class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println(getName() + "该线程正在执行");
    }
}

class MyThread1 extends Thread {
    public MyThread1(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(getName() + "正在运行" + i);
        }
    }
}

public class T2_1_通过Thread类创建线程 {
    public static void main(String[] args) {
//        System.out.println("主线程1正在执行");
//        MyThread myThread = new MyThread();
//        myThread.start();
//        System.out.println("主线程2正在执行");

        MyThread1 t1 = new MyThread1("线程1");
        MyThread1 t2 = new MyThread1("线程2");
        t1.start();
        t2.start();
    }
}
