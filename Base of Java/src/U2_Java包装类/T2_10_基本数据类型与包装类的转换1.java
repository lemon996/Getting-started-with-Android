package U2_Java包装类;

public class T2_10_基本数据类型与包装类的转换1 {
    public static void main(String[] args) {
        int score = 100;
        Integer score1 = score;
        System.out.println("Integer result: " + score1);
        System.out.println("double result: " + score1.doubleValue());
        System.out.println("long result: " + score1.longValue());
        System.out.println("int result: " + score1.intValue());
    }
}
