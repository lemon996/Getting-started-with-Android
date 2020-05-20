package U6_Java输入输出流;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class T3_7_字符个数 {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("D:\\ideaJava\\Getting-started-with-Android\\Base of Java\\src\\U6_Java输入输出流\\out\\speech.txt");
            int cnt = 0, flag = 0;
            while((flag = fis.read()) != -1) {
                ++cnt;
            }
            System.out.println("统计结果: speech.txt文件中共有" + cnt + "个字节。");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
