package U2_Java包装类;

public class T2_12_基本数据类型与包装类的转换2 {
    public static void main(String[] args) {
        double a = 12.5;
        String str1 = String.valueOf(a);
        System.out.println("double to String: " + str1);
        String str = "2.8";
        double b = Double.parseDouble(str);
        System.out.println("string to double: " + b);
    }
}
