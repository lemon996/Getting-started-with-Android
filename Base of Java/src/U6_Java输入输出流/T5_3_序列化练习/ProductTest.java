package U6_Java输入输出流.T5_3_序列化练习;

import java.io.*;

public class ProductTest {
    public static void main(String[] args) {
        Product p1 = new Product(123, "iphone", "telephone", 4880);
        Product p2 = new Product(234, "ipad", "computer", 5088);
        Product p3 = new Product(345, "macbook", "computer", 10688);
        Product p4 = new Product(256, "iwatch", "watch", 4799);

        try {
            FileOutputStream fos = new FileOutputStream("D:\\ideaJava\\Getting-started-with-Android\\Base of Java" +
                    "\\src\\U6_Java输入输出流\\out\\序列化练习.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(p1);
            oos.writeObject(p2);
            oos.writeObject(p3);
            oos.writeObject(p4);
            oos.flush();
            fos.close();
            oos.close();

            FileInputStream fis = new FileInputStream("D:\\ideaJava\\Getting-started-with-Android\\Base of Java" +
                    "\\src\\U6_Java输入输出流\\out\\序列化练习.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);

            Product p = null;
            for (int i = 0; i < 4; i++) {
                p = (Product) ois.readObject();
                System.out.println(p);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
