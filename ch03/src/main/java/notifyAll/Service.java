package notifyAll;

/**
 * Created by cheese on 2018/6/10.
 */
public class Service {
    public void testMethod(Object lock){
        try{
            synchronized (lock){
                System.out.println("begin wait() ThreadName="
                +Thread.currentThread().getName());
                lock.wait();
                System.out.println(" end wait() TheadName="
                + Thread.currentThread().getName());

            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
