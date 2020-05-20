package U6_Java输入输出流;

import java.io.*;

public class T3_14_缓冲流案例 {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("D:\\ideaJava\\Getting-started-with-Android\\Base of Java\\src\\U6_Java输入输出流\\out\\Output.txt");
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            FileInputStream fis = new FileInputStream("D:\\ideaJava\\Getting-started-with-Android\\Base of Java\\src\\U6_Java输入输出流\\out\\Output.txt");
            BufferedInputStream bis = new BufferedInputStream(fis);
            long start = System.currentTimeMillis();
            for (int i = 0; i < 100; i++) {
                bos.write(50);
                bos.write('a');
                bos.flush();    // 由于输出的数据未满不足以触发写入到硬盘，还是在缓冲区，所以得强制刷新并写入硬盘
            }
            long end = System.currentTimeMillis();
            // FileOutputStream先将写入的数据存储在BufferedOutputStream的字节数组中，
            // BufferedOutputStream再⼀次性输出，提高了字节的写入速率，比直接用FileOutputStream快
            System.out.println("所花时间：" + (end - start));
            System.out.println(bis.read());
            System.out.println((char) bis.read());
            bos.close();    // 效果与flush一样
            bis.close();
            fis.close();
            fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
