package tryLockTest;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author : Cheese
 * @date : 2018/6/12
 * @description : TODO
 */
public class MyService {
    public ReentrantLock lock = new ReentrantLock();
    public void waitMethod(){
        if(lock.tryLock()){
            System.out.println(Thread.currentThread().getName()+"获得锁");
        }else {
            System.out.println(Thread.currentThread().getName()+"没有获得锁");
        }
    }
}
