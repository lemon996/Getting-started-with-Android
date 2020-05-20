package U6_Java输入输出流;

import java.io.File;
import java.io.IOException;

public class T2_4_File类的常用方法 {
    public static void main(String[] args) {
        // 创建File对象
        // 直接利用绝对路径
        File file = new File("D:\\ideaJava\\Getting-started-with-Android\\Base of Java\\src\\U6_Java输入输出流\\U6_Java输入输出流.T2_4_File类的常用方法\\out\\score.txt");
//        File file = new File("D:\\ideaJava\\Getting-started-with-Android", "\\Base of Java\\src\\U6_Java输入输出流\\U6_Java输入输出流.T2_4_File类的常用方法\\score.txt");
        // 用其他File对象和当前路径的子路径来生成File对象
//        File file = new File("D:\\ideaJava\\Getting-started-with-Android");
//        File file1 = new File(file, "\\Base of Java\\src\\U6_Java输入输出流\\U6_Java输入输出流.T2_4_File类的常用方法\\score.txt");

        System.out.println("是否是目录：" + file.isDirectory());
        System.out.println("是否是文件：" + file.isFile());

        // 创建单级目录
        File file2 = new File("D:\\ideaJava\\Getting-started-with-Android\\Base of Java\\src\\U6_Java输入输出流\\U6_Java输入输出流.T2_4_File类的常用方法\\out", "Hashset");
        if(!file2.exists()) {
            file2.mkdir();
            System.out.println("文件夹创建成功2");
        }
        // 创建多级目录
        File file3 = new File("D:\\ideaJava\\Getting-started-with-Android\\Base of Java\\src\\U6_Java输入输出流\\U6_Java输入输出流.T2_4_File类的常用方法\\out\\mkdirs");
        if(!file3.exists()) {
            file3.mkdirs();
            System.out.println("文件夹创建成功3");
        }
        // 创建文件

        if(!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
