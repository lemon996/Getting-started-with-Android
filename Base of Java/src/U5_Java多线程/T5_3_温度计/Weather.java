package U5_Java多线程.T5_3_温度计;

import java.util.Random;

public class Weather {
    private int temperature;
    private int humidity;
    private boolean flag = false;

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public synchronized void generate() {
        if(!flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        flag = false;
        notifyAll();
        Random random = new Random();
        this.temperature = random.nextInt(40) + 1;
        this.humidity = random.nextInt(100) + 1;
        System.out.println("生成天气数据" + this);
    }

    public synchronized void read() {
        if(flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        flag = true;
        notifyAll();
        System.out.println("读取天气数据" + this);
    }

    @Override
    public String toString() {
        return "[温度：" + getTemperature() + "，湿度："
                + getHumidity() + "]";
    }
}
