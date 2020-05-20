package U6_Java输入输出流.T5_1_对象序列化和反序列化;

import java.io.*;

public class GoodsTest {

    public static void main(String[] args) {
        // 定义Goods类的对象
        Goods goods1 = new Goods("gd001", "电脑", 3000);
        try {
            // 对象序列化 Java对象转化成字节序列
            FileOutputStream fos = new FileOutputStream("D:\\ideaJava\\Getting-started-with-Android\\" +
                    "Base of Java\\src\\U6_Java输入输出流\\out\\序列化.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(goods1);
            oos.flush();
            fos.close();
            oos.close();

            // 对象反序列化 字节对象转换成Java对象
            FileInputStream fis = new FileInputStream("D:\\ideaJava\\Getting-started-with-Android\\" +
                    "Base of Java\\src\\U6_Java输入输出流\\out\\序列化.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Goods goods = (Goods) ois.readObject();
            System.out.println(goods);
            fis.close();
            ois.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
