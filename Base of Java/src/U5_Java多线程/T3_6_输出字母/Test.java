package U5_Java多线程.T3_6_输出字母;

public class Test {
    public static void main(String[] args) {
        Letter letter = new Letter();
        Thread thread = new Thread(letter);
        thread.start();
    }
}
