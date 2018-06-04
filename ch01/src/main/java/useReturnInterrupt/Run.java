package useReturnInterrupt;

/**
 * Created by cheese on 2018/6/3.
 */
public class Run {
    public static void main(String[] args) throws InterruptedException{
        MyThread t = new MyThread();
        t.start();
        Thread.sleep(2000);
        t.interrupt();

    }
}
