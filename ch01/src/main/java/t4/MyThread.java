package t4;

/**
 * Created by carino on 2018/5/30.
 */
public class MyThread extends Thread {
    private int count = 5;

    //增加synchronized关键字，实现同步
    @Override
    synchronized public void run() {
        super.run();
        count--;
        System.out.println("由 " + this.currentThread().getName()+" 计算，count="+count);
    }
}
