package lockMethodTest3.test1;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author : Cheese
 * @date : 2018/6/12
 * @description : TODO
 */
public class Service {
    private ReentrantLock lock;
    public Service(boolean isFair){
        super();
        lock = new ReentrantLock(isFair);
    }
    public void serviceMethod(){
        try{
            lock.lock();
            System.out.println("公平锁的情况：" + lock.isFair());
        }finally {
            lock.unlock();
        }
    }
}
