package U5_Java多线程.T5_3_温度计;

public class WeatherTest {
    public static void main(String[] args) {
        Weather w = new Weather();
        GenerateWeather generateWeather = new GenerateWeather(w);
        ReadWeather readWeather = new ReadWeather(w);
        Thread generate = new Thread(generateWeather);
        Thread read = new Thread(readWeather);
        generate.start();
        read.start();
    }
}
