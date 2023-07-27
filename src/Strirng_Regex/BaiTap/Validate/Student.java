package Strirng_Regex.BaiTap.Validate;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Student {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regex = "[CAP]\\d{4}[GHIK]";
        Pattern pattern = Pattern.compile(regex);
        boolean check;
        do {
            System.out.println("Nhập chuỗi: ");
            Matcher matcher = pattern.matcher(scanner.nextLine());
            check = matcher.matches();
            System.out.println("Đúng rồi");
        } while (check);
        System.out.println("Sai rồi");
    }
}
