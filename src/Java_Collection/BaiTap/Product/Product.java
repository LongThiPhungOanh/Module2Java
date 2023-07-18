package Java_Collection.BaiTap.Product;

import java.time.LocalDate;
import java.util.Comparator;

public abstract class Product implements Comparable<ProductManager>{
    int id = 0;
    private String name;
    int cost;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getCost() {
        return cost;
    }
    public void setCost(int cost) {
        this.cost = cost;
    }

    public Product() {
    }
    public Product(int id, String name, int cost) {
        this.id = id;
        this.name = name;
        this.cost = cost;
    }
    @Override
    public String toString() {
        return "Product { " +
                "id = " + id +
                ", name = '" + name + '\'' +
                ", cost = " + cost ;
    }
    @Override
    public abstract int compareTo(ProductManager o);

//    public abstract int compare(ProductManager o1, ProductManager o2);
}
