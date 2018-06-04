package t20;

import java.util.Random;

/**
 * Created by cheese on 2018/6/4.
 */
public class MyThread1 extends Thread {
    @Override
    public void run() {
        long beginTime = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            Random random = new Random();
            random.nextInt();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("***thread 1 use time=" + (endTime-beginTime));
    }
}
