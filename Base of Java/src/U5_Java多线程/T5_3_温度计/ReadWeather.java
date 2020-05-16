package U5_Java多线程.T5_3_温度计;

public class ReadWeather implements Runnable{
    private Weather weather;

    public ReadWeather(Weather weather) {
        this.weather = weather;
    }

    @Override
    public void run() {
        for(int i = 1; i <= 100; ++i) {
            this.weather.read();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
