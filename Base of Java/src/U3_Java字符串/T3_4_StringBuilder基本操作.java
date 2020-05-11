package U3_Java字符串;

public class T3_4_StringBuilder基本操作 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("欢迎来到");
        sb.append("imooc");
        System.out.println(sb);
        sb.delete(0, 4).insert(0, "你好,");
        System.out.println(sb);
        sb.replace(0, 3, "欢迎来到");
        System.out.println(sb);
    }
}
