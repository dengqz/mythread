package singleton_0;

/**
 * Created by cheese on 2018/6/12.
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println(MyObject.getInstance().hashCode());
    }

}
