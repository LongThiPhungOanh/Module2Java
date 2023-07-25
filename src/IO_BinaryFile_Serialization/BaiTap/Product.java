package IO_BinaryFile_Serialization.BaiTap;

import java.io.Serializable;

public class Product implements Serializable {
    private static final long serialUID = 123455675;
    private int idProduct;
    private String name;
    private double price;
    private String manufacturer;
    private String describe;
    public Product() {}
    public Product(int idProduct, String name, double price, String manufacturer, String describe) {
        this.idProduct = idProduct;
        this.name = name;
        this.price = price;
        this.manufacturer = manufacturer;
        this.describe = describe;
    }
    public int getIdProduct() {
        return idProduct;
    }
    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public String getManufacturer() {
        return manufacturer;
    }
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
    public String getDescribe() {
        return describe;
    }
    public void setDescribe(String describe) {
        this.describe = describe;
    }

    @Override
    public String toString() {
        return "Product :" +
                "idProduct = " + idProduct +
                ", name = '" + name + '\'' +
                ", price = " + price +
                ", manufacturer = '" + manufacturer + '\'' +
                ", describe = '" + describe + '\'';
    }
}
