package U4_Java集合;

import java.util.ArrayList;

public class T2_4_ArrayList对字符串的存储 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("语文");
        list.add("数学");
        list.add("英语");
        list.add("化学");
        list.add("物理");
        list.add("生物");
        System.out.println(list.size());
        for (int i = 0; i < list.size(); i++) {
            System.out.println("第" + (i + 1) + "个为" + list.get(i));
        }
    }
}
