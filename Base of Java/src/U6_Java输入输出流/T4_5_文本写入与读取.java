package U6_Java输入输出流;

import java.io.*;

public class T4_5_文本写入与读取 {

    public static void transWriteByBuf(String s) {
        try {
            FileWriter fw = new FileWriter("D:\\ideaJava\\Getting-started-with-Android\\Base of Java\\src\\" +
                    "U6_Java输入输出流\\out\\hi.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(s);
            bw.flush();
            fw.close();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void transReadByBuf() {
        try {
            FileReader fr = new FileReader("D:\\ideaJava\\Getting-started-with-Android\\Base of Java\\src\\" +
                    "U6_Java输入输出流\\out\\hi.txt");
            BufferedReader br = new BufferedReader(fr);
            String s = "";
            while ((s = br.readLine()) != null) {
                System.out.println(s);
            }
            fr.close();
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String s = "你好吗？\n" +
                "我很好！";
        transWriteByBuf(s);
        transReadByBuf();
    }
}
