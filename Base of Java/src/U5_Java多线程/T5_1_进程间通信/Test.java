package U5_Java多线程.T5_1_进程间通信;

public class Test {
    public static void main(String[] args) {
        Queue queue = new Queue();
        new Thread(new Producer(queue)).start();
        new Thread(new Customer(queue)).start();
    }
}
