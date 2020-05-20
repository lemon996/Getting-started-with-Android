package U6_Java输入输出流;

import java.io.File;
import java.io.IOException;

public class T2_7_文件操作练习 {
    public static void main(String[] args) {
        File f = new File("File\\Mondy.docx");
        if(!f.exists()) {
            try {
                f.createNewFile();
                System.out.println("文件名：" + f.getName());
                System.out.println("父目录：" + f.getParent());
                System.out.println("是文件吗？" + f.isFile());
                System.out.println("可读吗？" + f.canRead());
                System.out.println("可写吗？" + f.canWrite());
                System.out.println("绝对路径：" + f.getAbsolutePath());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
