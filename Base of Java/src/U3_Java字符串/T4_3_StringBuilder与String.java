package U3_Java字符串;

public class T4_3_StringBuilder与String {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("abc");
        sb.reverse().insert(0, "fed---")
                .delete(3, 6);
        System.out.println(sb);
    }
}
