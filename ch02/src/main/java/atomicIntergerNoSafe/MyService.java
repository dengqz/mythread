package atomicIntergerNoSafe;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by cheese on 2018/6/8.
 */
public class MyService {
    public static AtomicLong aiRef = new AtomicLong();
    synchronized public void addNum(){
        System.out.println(Thread.currentThread().getName()+"加了100之后的值是："
        +aiRef.addAndGet(100));
        aiRef.addAndGet(1);
    }
}
