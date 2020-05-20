package U5_Java多线程;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

class ThreadTest3 implements Callable<String> {
    @Override
    public String call() throws Exception {
        String str = "多线程的第三种创建方式";
        return str;
    }
}

public class T_ex_callable创建多线程 {
    public static void main(String[] args) {
        ThreadTest3 call = new ThreadTest3();
        FutureTask<String> ft = new FutureTask<>(call);
        Thread t3 = new Thread(ft);
        t3.start();
        try {
            System.out.println(ft.get());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }
}
