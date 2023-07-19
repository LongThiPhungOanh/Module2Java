package ThuatToanTimKiem.BaiTap.MaxMin;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String inputString = scanner.nextLine();
//        String[] split = inputString.split("");
        int[] frequentChar = new int[255];
        int ascii;
        for (int i = 0; i < inputString.length(); i++) {
            ascii = inputString.charAt(i);
            frequentChar[ascii] += 1;
        }
    }
}
