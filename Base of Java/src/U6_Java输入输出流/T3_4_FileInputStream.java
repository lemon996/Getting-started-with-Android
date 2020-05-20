package U6_Java输入输出流;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class T3_4_FileInputStream {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("D:\\ideaJava\\Getting-started-with-Android\\Base of Java\\src\\U6_Java输入输出流\\out\\Hello.txt");
            // 用 read方法读取数据
//            int read = fis.read();
//            System.out.println((char)read);
            // 循环读取
//            int read = 0;
//            while ((read = fis.read()) != -1) {
//                System.out.print((char) read);
//            }
            //read读取在byte数组里
            byte[] b = new byte[100];
            // 字节数组、偏移量、长度
            fis.read(b, 0, 5);
            System.out.println(new String(b));
            fis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
