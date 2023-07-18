package Java_Collection.BaiTap.Product;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
      ProductManager productManager = new ProductManager();
        do {
            System.out.println("Nhấn 1 để thêm");
            System.out.println("Nhấn 2 để sửa");
            System.out.println("Nhấn 3 để xóa");
            System.out.println("Nhấn 4 để xem tất cả sản phẩm");
            System.out.println("Nhấn 5 Xem sản phẩm tăng dần và giảm dần");
            System.out.println("Nhấn 0 để thoát");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    productManager.addProduct();
                    break;
                case 2:
                    productManager.editProduct();
                    break;
                case 3:
                    productManager.deleteProduct();
                    break;
                case 4:
                    productManager.showProduct();
                    break;
                case 5:
                   productManager.getCompareTo();
            }
        } while (choice != 0);
    }
}
