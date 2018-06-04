package t2;

/**
 * Created by carino on 2018/5/30.
 */
public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("运行中！");
    }
}
//实现Runnable接口创建线程类