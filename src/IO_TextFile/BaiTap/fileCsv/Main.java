package IO_TextFile.BaiTap.fileCsv;
import java.io.*;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        try{
            File file = new File("C:\\Users\\Admin\\OneDrive\\Desktop\\csv.txt");
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            while ((line = br.readLine()) != null) {
                String[] display = line.split(",");
                System.out.println(Arrays.toString(display));
            }
        } catch (IOException e) {
            System.err.println("Fie không tồn tại hoặc có nội dung có lỗi!");
        }
    }
}
