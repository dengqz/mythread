package t1;

/**
 * Created by carino on 2018/5/30.
 */
public class Run {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        System.out.println("运行结束！");
    }
}
//运行类，在使用多线程技术的时候，代码的运行结果与代码执行顺序或调用顺序是无关的。
