package Threading.BaiTap.thread;

public class NumberGenerator implements Runnable{
    @Override
    public void run() {
        for (int i = 1; i < 11; i++) {
            System.out.println("số tự nhiên " + i);
        }
    }
}
