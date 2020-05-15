package U4_Java集合.T4_7_商品信息管理;

import java.util.HashMap;
import java.util.Iterator;

public class GoodTest {
    public static void main(String[] args) {
        Goods g1 = new Goods("s001", "冰箱", 5000);
        Goods g2 = new Goods("s002", "手机", 2000);
        Goods g3 = new Goods("s003", "电视", 3000);

        HashMap<String, Goods> goodsHashMap = new HashMap<>();
        goodsHashMap.put(g1.getId(), g1);
        goodsHashMap.put(g2.getId(), g2);
        goodsHashMap.put(g3.getId(), g3);
        Iterator<Goods> it = goodsHashMap.values().iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
