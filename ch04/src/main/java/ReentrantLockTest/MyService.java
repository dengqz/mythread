package ReentrantLockTest;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author : Cheese
 * @date : 2018/6/11
 * @description : TODO
 */
public class MyService {
    public Lock lock = new ReentrantLock();
    public void testMethod(){
        lock.lock();
        for (int i = 0; i < 5; i++) {
            System.out.println("ThreadName="+Thread.currentThread().getName()
            +(" "+(i+1)));
        }
        lock.unlock();
    }
}
