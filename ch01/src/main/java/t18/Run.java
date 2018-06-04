package t18;


/**
 * Created by cheese on 2018/6/4.
 */
public class Run {
    public static void main(String[] args) {
        System.out.println("main thread begin priority="
        + Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(6);
        System.out.println("main thread end priority="
                + Thread.currentThread().getPriority());
        MyThread1 thread1 = new MyThread1();
        thread1.start();
    }
}
