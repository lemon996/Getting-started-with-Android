package U6_Java输入输出流;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class T3_8_FileIOutputStream {
    public static void main(String[] args) {
        FileOutputStream fos;
        FileInputStream fis;
        try {
            fos = new FileOutputStream("D:\\ideaJava\\Getting-started-with-Android\\Base of Java\\src\\U6_Java输入输出流\\out\\Output.txt");
            fis = new FileInputStream("D:\\ideaJava\\Getting-started-with-Android\\Base of Java\\src\\U6_Java输入输出流\\out\\Output.txt");
            long start = System.currentTimeMillis();
            for (int i = 0; i < 100; i++) {
                fos.write(50);      // 直接打开是2，因为是直接打开txt是以ascii码
                fos.write('a');
            }
            long end = System.currentTimeMillis();  //比通过BufferedOutputStream慢
            System.out.println("所花时间：" + (end - start));
            System.out.println(fis.read());         // 50
            System.out.println((char) fis.read());  // a
            fos.close();
            fis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
