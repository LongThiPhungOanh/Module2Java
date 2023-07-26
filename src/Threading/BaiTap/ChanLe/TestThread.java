package Threading.BaiTap.ChanLe;

public class TestThread {
    public static void main(String[] args) throws InterruptedException {
        long start = System.currentTimeMillis();
        Thread oddThread = new Thread(new OddThread());
        Thread evenThread = new Thread(new EvenThread());
        Thread.sleep(10);
        System.out.println("Thời gian nghỉ của cố lẻ tính bằng millis:  " +(System.currentTimeMillis()-start));
        Thread.sleep(15);
        System.out.println("Thời gian nghỉ của số chản tính bằng millis:  " +(System.currentTimeMillis()-start));
        evenThread.start();
        oddThread.start();
    }
}
