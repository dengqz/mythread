package ConditionTestMoreMethod;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author : Cheese
 * @date : 2018/6/11
 * @description : TODO
 */
public class MyService {
    private Lock lock = new ReentrantLock();
    public void methodA(){
        try{
            lock.lock();
            System.out.println("methodA begin THreadName="
            +Thread.currentThread().getName()+" time="
            +System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("method end ThreadName="
            +Thread.currentThread().getName()+" time="
            +System.currentTimeMillis());
        }catch (InterruptedException e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
    public void methodB(){
        try{
            lock.lock();
            System.out.println("methodB begin ThreadName="
            +Thread.currentThread().getName()+" time="
            +System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("methodB end ThreadName="
            +Thread.currentThread().getName()+" time="
            +System.currentTimeMillis());
        }catch (InterruptedException e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }

}
