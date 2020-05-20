package U6_Java输入输出流.T5_3_序列化练习;

import java.io.Serializable;

public class Product implements Serializable {
    private int id;
    private String name;
    private String categories;
    private double prices;

    public Product(int id, String name, String categories, double prices) {
        this.id = id;
        this.name = name;
        this.categories = categories;
        this.prices = prices;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", categories='" + categories + '\'' +
                ", prices=" + prices +
                '}';
    }
}
