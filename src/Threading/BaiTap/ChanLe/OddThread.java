package Threading.BaiTap.ChanLe;

import com.sun.source.tree.SynchronizedTree;

public class OddThread extends Thread{
    @Override
    synchronized public void run() {
        for (int i = 1; i < 11; i++) {
            if (i % 2 == 1){
                System.out.println("số lẻ: " + i);
            }
        }
    }
}