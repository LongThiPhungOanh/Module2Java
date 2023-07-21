package Exceptione_DeBug.Debug;

import java.util.Scanner;

public class Debug {
    public static void main(String[] args) {
        System.out.println("a * x + b = 0");
        Scanner scanner = new Scanner(System.in);
        System.out.println("a: ");
        double a = scanner.nextDouble();
        System.out.println("b: ");
        double b = scanner.nextDouble();
    }
}
