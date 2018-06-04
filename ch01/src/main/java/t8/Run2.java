package t8;

/**
 * Created by cheese on 2018/6/3.
 */
public class Run2 {
    public static void main(String[] args) {
        MyThread1 myThread = new MyThread1();
        System.out.println("begin ="+ System.currentTimeMillis());
        myThread.start();
        System.out.println("end   ="+ System.currentTimeMillis());
    }
}
//异步执行