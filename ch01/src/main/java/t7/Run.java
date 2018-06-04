package t7;

/**
 * Created by cheese on 2018/6/3.
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
        System.out.println("begin ==" + myThread.isAlive());
        myThread.start();
        Thread.sleep(1000);
        System.out.println("end ==" + myThread.isAlive());
    }
}
//方法isAlive()的作用是测试线程是否处于活动状态。活动状态就是线程已经启动且尚未中止。
