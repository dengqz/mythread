package t2;


/**
 * Created by cheese on 2018/5/30.
 */
public class Run {
    public static void main(String[] args) {
        Runnable runnable = new MyRunnable();
        Thread thread = new Thread(runnable);
        thread.start();
        System.out.println("运行结束！");
    }
}
//构造函数Thread(Runnable tatget)不光可以传入Runnable接口的对象，
// 还可以传入一个Thread类对象，这样做完全可以将一个Thread对象中的run()方法
//交由其他的线程进行调用(Thread类也实现了Runnable接口)
