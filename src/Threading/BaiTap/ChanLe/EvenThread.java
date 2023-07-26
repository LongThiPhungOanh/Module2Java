package Threading.BaiTap.ChanLe;

public class EvenThread extends Thread{
    @Override
    synchronized public void run() {
        for (int i = 1; i < 11; i++) {
            if (i % 2 == 0){
                System.out.println("số chẳn: " + i);
            }
        }
    }
}
