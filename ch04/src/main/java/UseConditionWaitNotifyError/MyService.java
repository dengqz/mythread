package UseConditionWaitNotifyError;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by cheese on 2018/6/11.
 */
public class MyService {
    private Lock lock = new ReentrantLock();
    private Condition condition=lock.newCondition();
    public void await(){
        try{
            condition.await();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
