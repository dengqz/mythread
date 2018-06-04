package t1;

/**
 * Created by carino on 2018/6/3.
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        super.run();
        System.out.println("MyThread");
    }
}
//创建一个自定义的线程类，继承Thread,并且重写run方法，在run方法中写线程要执行的任务代码
