package U2_Java包装类;

public class T2_19_基本数据类型与包装类的转换3 {
    public static void main(String[] args) {
        float f1 = 88.99f;
        String s1 = String.valueOf(f1);
        System.out.println(s1 + 20);
        String str = "188.55";
        double res = Double.parseDouble(str);
        System.out.println(res + 20);
    }
}
