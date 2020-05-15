package U4_Java集合;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class T4_4_HashMap与世界杯 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("2006", "意大利");
        map.put("2014", "德国");
        map.put("2010", "西班牙");

        Iterator<String> it = map.values().iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + "\t");
        }
        System.out.println("\n---------------");

        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            System.out.print(entry.getKey() + "-");
            System.out.println(entry.getValue());
        }
    }
}
