package U6_Java输入输出流;

import java.io.*;

public class T4_3_字节字符转换流 {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("D:\\ideaJava\\Getting-started-with-Android\\" +
                    "Base of Java\\src\\U6_Java输入输出流\\out\\Hello.txt");
            InputStreamReader isr = new InputStreamReader(fis);

            FileOutputStream fos = new FileOutputStream("D:\\ideaJava\\Getting-started-with-Android\\" +
                    "Base of Java\\src\\U6_Java输入输出流\\out\\Hello1.txt");
            OutputStreamWriter osw = new OutputStreamWriter(fos);
            int n = 0;
//            while ((n = isr.read()) != -1) {
//                System.out.print((char) n);
//            }
            char[] cbuf = new char[10];
            while((n = isr.read(cbuf)) != -1) {
                String s = new String(cbuf, 0, n);
                osw.write(cbuf, 0, n);
                System.out.print(s);
            }
            osw.flush();

            fis.close();
            isr.close();
            fos.close();
            osw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
