package U3_Java字符串;

public class T2_6_String常用方法 {
    public static void main(String[] args) {
        String str = "abcdefg";
        str = str.substring(2, 5).toUpperCase();
        str = str.replace("DE", "MM");
        System.out.println(str);
    }
}
