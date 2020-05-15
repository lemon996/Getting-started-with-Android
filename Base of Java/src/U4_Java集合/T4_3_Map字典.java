package U4_Java集合;

import java.util.*;

public class T4_3_Map字典 {
    public static void main(String[] args) {
        HashMap<String, String> animal = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 2; ++i) {
            System.out.println("请输入中文：");
            String k = sc.next();
            System.out.println("请输入英文：");
            String v = sc.next();
            animal.put(k, v);
        }

        // 使用迭代器来输出所有的Value
        System.out.println("---------------");
        Iterator<String> it = animal.values().iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println("\n---------------");

        // 使用增强for循环来输出所有的Key和Value
        Set<Map.Entry<String, String>> entries = animal.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            System.out.print(entry.getKey() + "-");
            System.out.println(entry.getValue());
        }
        System.out.println("---------------");

        // 通过中文找到英文
        boolean flag = false;
        String find = sc.next();
        Set<String> keySet = animal.keySet();
        for (String s : keySet) {
            if(s.equals(find)) {
                flag = true;
                System.out.println("找到了：" + animal.get(s));
                break;
            }
        }
        if(!flag) {
            System.out.println("找不到");
        }
    }
}

