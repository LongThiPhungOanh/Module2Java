package Strirng_Regex.BaiTap.PhoneNumber;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String regex = ("\\(\\d{2}\\)-\\([0]\\d{9}\\)");
        Pattern pattern = Pattern.compile(regex);
        boolean check;
        do {
            System.out.println("Nhập chuỗi: ");
            Matcher matcher = pattern.matcher(input.nextLine());
            check = matcher.matches();
            System.out.println("Đúng rồi");
        } while (check);
        System.out.println("Sai rồi");
    }
}
