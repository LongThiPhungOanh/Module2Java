package Exceptione_DeBug.Triangle;
import java.util.Scanner;
public class Triangle {
    public static boolean isTriangle(double a, double b, double c) {
        return a + b > c && a + c > b && b + c > a;
    }
    public static double calculateTrianglePerimeter(double a, double b, double c) throws Exception {
        if (!isTriangle(a, b, c)) {
            throw new Exception("Khong phai tam giac");
        }
        return a + b + c;
    }
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Nhap do dai canh thu nhat: ");
            double a = scanner.nextDouble();
            System.out.print("Nhap do dai canh thu hai: ");
            double b = scanner.nextDouble();
            System.out.print("Nhap do dai canh thu ba: ");
            double c = scanner.nextDouble();
            double perimeter = calculateTrianglePerimeter(a, b, c);
            System.out.println("Tong ba canh tam giac: " + perimeter);
        } catch (Exception e) {
            System.out.println("Loi: " + e.getMessage());
        }
    }
}


