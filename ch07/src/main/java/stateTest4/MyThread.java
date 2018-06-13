package stateTest4;

/**
 * @author : Cheese
 * @date : 2018/6/13
 * @description : TODO
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        try{
            synchronized (Lock.lock){
                Lock.lock.wait();
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
