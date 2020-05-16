package U5_Java多线程.T2_8_Runnanle接口实现dog_cat;

public class Cat implements Runnable{
    @Override
    public void run() {
        for(int i = 1; i <= 3; i++) {
            System.out.println(Thread.currentThread().getName() + " cat");
        }
    }
}
