package singleton_7;

/**
 * @author : Cheese
 * @date : 2018/6/13
 * @description : TODO
 */
public class Run {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();
        t1.start();
        t2.start();
        t3.start();
    }
}
