package t7;

/**
 * Created by cheese on 2018/6/3.
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("run=" + this.isAlive());
    }
}
