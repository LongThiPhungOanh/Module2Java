package IO_TextFile.BaiTap.fileCsv;
import java.io.*;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
//        try{
//            File file = new File("C:\\Users\\Admin\\OneDrive\\Desktop\\csv.txt");
//            BufferedReader br = new BufferedReader(new FileReader(file));
//            String line;
//            while ((line = br.readLine()) != null) {
//                String[] display = line.split(",");
//                System.out.println(Arrays.toString(display));
//            }
//        } catch (IOException e) {
//            System.err.println("Fie không tồn tại hoặc có nội dung có lỗi!");
//        }
        Double[] arr = {1.0, 3.0, 5.0, 7.0};
        System.out.println(Arrays.toString(maxMinAvg(arr)));
    }
    public static Double[] maxMinAvg(Double[] arr) {
        Double[] arrnew = new Double[3];
        Double max = arr[0];
        Double min = arr[0];
        Double sum = arr[arr.length-1];
        Double avg = 0.0;
        for(int i = 0; i< arr.length-1; i++){
            sum += arr[i];
            if(max < arr[i + 1]){
                max = arr[i+1];
            } else if (min > arr[i+1]){
                min = arr[i+1];
            }
        }
        avg = sum / arr.length;
        arrnew[0] = max;
        arrnew[1] = min;
        arrnew[2] = avg;
        return arrnew;
    }
}
