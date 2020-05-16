package U5_Java多线程.T5_3_温度计;

public class GenerateWeather implements Runnable{
    private Weather weather;

    public GenerateWeather(Weather weather) {
        this.weather = weather;
    }

    @Override
    public void run() {
        for(int i = 1; i <= 100; i++) {
            this.weather.generate();
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
