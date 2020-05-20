package U6_Java输入输出流;

import java.io.File;
import java.io.IOException;

public class T2_8_绝对路径与相对路径 {
    public static void main(String[] args) {
        // 直接输入文件名是在工程文件夹下操作
        File file = new File("thread.txt");
        try {
            // 创建文件
            file.createNewFile();
            // 是否是绝对路径
            System.out.println(file.isAbsolute());
            // 获取路径
            System.out.println(file.getPath());
            // 获取绝对路径
            System.out.println(file.getAbsoluteFile());
            // 获取文件名
            System.out.println(file.getName());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
