package waitReleaseLock;

/**
 * Created by cheese on 2018/6/10.
 */
public class Service {
    public void testMethod(Object lock){
        try{
            synchronized (lock){
                System.out.println("begin wait()");
                Thread.sleep(40000);
                System.out.println(" end wait()");
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
