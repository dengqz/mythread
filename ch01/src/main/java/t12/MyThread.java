package t12;

/**
 * Created by cheese on 2018/6/3.
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 500000; i++) {
            System.out.println("i=" + (i+1));
        }
    }
}
