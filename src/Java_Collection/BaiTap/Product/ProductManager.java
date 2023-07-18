package Java_Collection.BaiTap.Product;
import java.util.*;

public class ProductManager extends Product{
    List<ProductManager> product = new ArrayList<>();
    public List<ProductManager> getProduct() {
        return product;
    }
    public ProductManager() {
    }
    private final Scanner input = new Scanner(System.in);

    public ProductManager(int id, String name, int cost) {
        super(id, name, cost);
    }

    public void addProduct() {
        int check = getId();
        System.out.println("Bạn muốn thêm mấy sản phẩm");
        int length = Integer.parseInt(input.nextLine());
        for (int i = 0; i < length; i++) {
            check++;
            System.out.println("Nhập tên");
            String name = input.nextLine();
            System.out.println("Nhập giá");
            int cost = Integer.parseInt(input.nextLine());
            ProductManager product1 = new ProductManager(check, name, cost);
            product.add(product1);
            System.out.println("---------------------------------");
            showProduct();
        }
    }
    public void editProduct() {
        showProduct();
        if (check()) {
            System.out.println("Nhập id sản phẩm bạn muốn sửa");
            int id = Integer.parseInt(input.nextLine());
            for (int i = 0; i < product.size(); i++) {
                if (id == product.get(i).getId()) {
                    System.out.println("Nhập tên");
                    String name = input.nextLine();
                    System.out.println("Nhập giá");
                    int cost = Integer.parseInt(input.nextLine());
                    ProductManager product1 = new ProductManager(getId(), name, cost);
                    product.add(product1);
                    System.out.println("---------------------------------");
                    showProduct();
                }
            }
        }
    }
    public void deleteProduct() {
        showProduct();
       if (check()){
            System.out.println("Nhập id sản phẩm bạn muốn xóa");
            int id = Integer.parseInt(input.nextLine());
            for (int i = 0; i < product.size(); i++) {
                if (id == product.get(i).getId()) {
                    product.remove(product.get(i));
                    System.out.println("Xoa thanh cong");
                }
            }
        }
    }
    public void showProduct() {
        if (check()) {
            for (ProductManager check : product) {
                System.out.println("Tất cả sản phẩm " + check.toString());
            }
        } else {
            System.out.println("Hiện không có sản phẩm nào");
        }
    }
    public boolean check() {
        return product.size() > 0;
    }
    public void getCompareTo(){
        Collections.sort(product);
        System.out.println("Sản phẩm giá tăng dần \n " + product);
        for (int i = product.size(); i > 0; i--) {
            System.out.println("Sản phẩm giá giảm dần  " + product.get(i-1));
        }
//        Collections.sort(product, new Comparator(){
//            public int compare(Object o1, Object o2) {
//                return -1;
//            }
//        });
    }
    @Override
    public int compareTo(ProductManager o) {
        if (this.getCost() == o.getCost()) {
            return (this.getId() - o.getId());
        }
        return this.getCost() - o.getCost();
    }

//    @Override
//    public int compare(ProductManager o1, ProductManager o2) {
//        return 0;
//    }

}

