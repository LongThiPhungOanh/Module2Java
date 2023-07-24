package IO_TextFile.BaiTap.CopyFileText;
import java.io.*;
import java.util.Scanner;
public class Main {
    final static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        sourceFile();
//        targetFile();
    }
    public static void sourceFile() throws IOException {
        try {
            System.out.println("Nhập tệp nguồn");
            String path = scanner.nextLine();
            File file = new File(path);
            FileReader fileReader = new FileReader(file);
            int a;
            while ((a = fileReader.read()) != -1) {
                System.out.print((char) a);
            } 
        } catch (FileNotFoundException e){
            System.out.println("Tệp tin nguồn không tồn tại");
        }
    }
    public static void targetFile(File file) {
        try { 
            System.out.println("Nhập tệp đích");
            String path = scanner.nextLine();
            File file1 = new File(path);
            FileWriter fileWriter = new FileWriter(file1,true);
            fileWriter.write(String.valueOf(file));
            
        } catch (IOException e) {
            System.out.println("Tệp tin đích đã tồn tại");
        }
    }
}
