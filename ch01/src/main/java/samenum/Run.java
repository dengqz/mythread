package samenum;

/**
 * Created by carino on 2018/5/31.
 */
public class Run {
    public static void main(String[] args) {
        MyThread run = new MyThread();
        Thread t1 = new Thread(run);
        Thread t2 = new Thread(run);
        Thread t3 = new Thread(run);
        Thread t4 = new Thread(run);
        Thread t5 = new Thread(run);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
//i--与System.out.println()异常
//虽然println()方法在内部是同步的，但i--操作确实在进入println()之前发生的，所以有非线程安全问题的概率