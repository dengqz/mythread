package volatileTestThread;

/**
 * Created by cheese on 2018/6/8.
 */
public class MyThread extends Thread {
    volatile public static int count;
    synchronized private static void addCount(){
        for (int i = 0; i < 100; i++) {
            count++;
        }
        System.out.println("count="+count);
    }

    @Override
    public void run() {
        addCount();
    }
}
