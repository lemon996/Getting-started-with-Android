package U5_Java多线程.T2_8_Runnanle接口实现dog_cat;

public class Test {
    public static void main(String[] args) {
        for(int i = 1; i <= 3; i++) {
            System.out.println(Thread.currentThread().getName() + " thread");
        }
        Dog dog = new Dog();
        Thread t1 = new Thread(dog);
        t1.start();
        Cat cat = new Cat();
        Thread t2 = new Thread(cat);
        t2.start();
    }
}
