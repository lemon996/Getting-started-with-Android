package U5_Java多线程.T3_6_输出字母;

public class Letter implements Runnable{
    private char letter[];

    public Letter() {
        this.letter = new char[30];
        for(int i = 0; i < 26; ++i) this.letter[i] = (char) ('a' + i);
    }

    @Override
    public void run() {
        for(int i = 0; i < 26; ++i) {
            System.out.print(this.letter[i] + " ");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
