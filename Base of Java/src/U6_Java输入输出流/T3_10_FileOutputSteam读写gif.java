package U6_Java输入输出流;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class T3_10_FileOutputSteam读写gif {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("D:\\ideaJava\\Getting-started-with-Android\\" +
                    "Base of Java\\src\\U6_Java输入输出流\\out\\happy.jpg");
            FileOutputStream fos = new FileOutputStream("D:\\ideaJava\\Getting-started-with-Android\\" +
                    "Base of Java\\src\\U6_Java输入输出流\\out\\happyOutPut.jpg");
            byte[] b = new byte[1024];
            int n = 0;
            while ((n = fis.read(b)) != -1) {
                fos.write(b, 0, n);   // 如果不加数组长度，文件最后一次写入会多读数据，gif是多读的所以长度会比原来要大
            }
            fis.close();
            fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
