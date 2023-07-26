package Threading.BaiTap.thread;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        long start = System.currentTimeMillis();
        Thread thread1 = new Thread(new NumberGenerator());
        Thread thread2 = new Thread(new NumberGenerator());
        Thread.sleep(500);
        System.out.println("Mã hashCode của thread1 " + thread1.hashCode());
        System.out.println("Mã hashCode của thread1 " + thread2.hashCode());
        System.out.println("Thời gian nghỉ tính bằng millis:  " +(System.currentTimeMillis()-start));
        thread1.start();
        thread2.start();
    }
}
