package U4_Java集合.T3_6_宠物猫管理系统;

import java.util.HashSet;
import java.util.Iterator;

public class CatTest {
    public static void main(String[] args) {
        // 定义宠物猫对象
        Cat huahua = new Cat("花花", 12, "英国短尾猫");
        Cat fanfan = new Cat("凡凡", 3, "中国短尾猫");
        // 将宠物猫对象放入HashSet中
        HashSet<Cat> set = new HashSet<>();
        set.add(huahua);
        set.add(fanfan);

        Iterator<Cat> it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("--------------------------");
        // 添加一个重复元素
        Cat huahua1 = new Cat("花花", 12, "英国短尾猫");
        set.add(huahua1);
        it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("--------------------------");

        // 通过对象名来查找元素是否存在
        if (set.contains(huahua)) {
            System.out.println("花花找到了");
            System.out.println(huahua);
        } else {
            System.out.println("花花没找到");
        }

        // 通过对象属性来查找元素是否存在
        it = set.iterator();
        boolean flag = false;
        while (it.hasNext()) {
            Cat c = it.next();
            if (c.getName().equals("凡凡")) {
                flag = true;
                break;
            }
        }
        if (flag == true) {
            System.out.println("花花找到了");
            System.out.println(huahua);
        } else {
            System.out.println("花花没找到");
        }

        // 删除一个元素
        for (Cat cat : set) {
            if (cat.getName().equals("花花")) {
                set.remove(cat);
                break;
            }
        }
        System.out.println("删除后：");
        for (Cat cat : set) {
            System.out.println(cat);
        }

        // 删除所有元素
        boolean b = set.removeAll(set);
        if (b == true) {
            System.out.println("删除成功");
        } else {
            System.out.println("删除失败");
        }

    }
}
