package synlockin_2;

/**
 * Created by cheese on 2018/6/7.
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        Sub sub = new Sub();
        sub.operateISubMethod();
    }
}
