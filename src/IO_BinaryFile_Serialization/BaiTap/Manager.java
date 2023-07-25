package IO_BinaryFile_Serialization.BaiTap;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Manager extends Product{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Product> products;
        System.out.println("thêm nhấn 1, tìm nhấn 2");
        int check = Integer.parseInt(scanner.nextLine());
        if (check == 1) {
            do {
                products = showProduct();
                if (products.isEmpty()) {
                    System.out.println("không có sản phẩm");
                } else {
                    for (Product display : products) {
                        System.out.println(display);
                    }
                }
                System.out.println("Nhập id");
                int id = Integer.parseInt(scanner.nextLine());
                System.out.println("Nhập tên");
                String name = scanner.nextLine();
                System.out.println("Nhập giá");
                int price = Integer.parseInt(scanner.nextLine());
                System.out.println("Nhập hãng");
                String manufacturer = scanner.nextLine();
                System.out.println("Nhập ghi chú");
                String describe = scanner.nextLine();
                Product product = new Product(id, name, price, manufacturer, describe);
                products.add(product);
                addProduct(products);
            } while (true);
        } if(check == 2){
            products = showProduct();
            if (products.isEmpty()) {
                System.out.println("không có sản phẩm");
            } else {
                for (Product display : products) {
                    System.out.println(display);
                }
            }
            System.out.println("Nhập id sản phẩm bạn muốn tìm");
            int id = Integer.parseInt(scanner.nextLine());
            for (Product product : products) {
                if (id == product.getIdProduct()) {
                    System.out.println(product);
                    break;
                }
            }
        }
    }
    public static void addProduct(List<Product> productList) {
        try {
            File file = new File("C:\\Users\\Admin\\IdeaProjects\\NEWPROJECT\\Module2_Java\\src\\Binary");
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(productList);
            objectOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static List<Product> showProduct() {
        List<Product> products = new ArrayList<>();
        try {
            File file = new File("C:\\Users\\Admin\\IdeaProjects\\NEWPROJECT\\Module2_Java\\src\\Binary");
            FileInputStream fileInputStream = new FileInputStream(file);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            Object object = objectInputStream.readObject();
            products = (List<Product>) object;
        } catch (IOException | ClassNotFoundException | ClassCastException e) {
            e.printStackTrace();
        }
        return products;
    }
}
