package U6_Java输入输出流;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class T3_16_比较File和Buffered速度 {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("D:\\ideaJava\\Getting-started-with-Android\\" +
            "Base of Java\\src\\U6_Java输入输出流\\out\\one.txt");
            long start1 = System.currentTimeMillis();
            for (int i = 0; i < 100000; i++) {
                fos.write('a');
            }
            long end1 = System.currentTimeMillis();
            System.out.println("FileOutputStream所花时间：" + (end1 - start1));
            FileOutputStream fos1 = new FileOutputStream("D:\\ideaJava\\Getting-started-with-Android\\" +
                    "Base of Java\\src\\U6_Java输入输出流\\out\\one.txt");
            BufferedOutputStream bos = new BufferedOutputStream(fos1);
            long start2 = System.currentTimeMillis();
            for (int i = 0; i < 100000; i++) {
                bos.write('a');
            }
            long end2 = System.currentTimeMillis();
            System.out.println("BufferedOutputStream所花时间：" + (end2 - start2));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
