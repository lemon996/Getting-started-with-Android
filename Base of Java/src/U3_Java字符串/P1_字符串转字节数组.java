package U3_Java字符串;

public class P1_字符串转字节数组 {
    public static void main(String[] args) {
        // 字符串转字节数组
        String s1 = "abcde一二三四五";
        byte[] strBytes = s1.getBytes();
        for (byte strByte : strBytes) {
            System.out.print(strByte + " ");
        }
        System.out.println("");
        // 字节数组转字符串
        String s2 = new String(strBytes);
        System.out.println(s2);
    }
}
