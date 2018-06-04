package t8;

/**
 * Created by cheese on 2018/6/3.
 */
public class MyThread2 extends Thread {
    @Override
    public void run() {
        try{
            System.out.println("run threadName="
                    + this.currentThread().getName() + " begin");
            Thread.sleep(2000);
            System.out.println("run threadName="
                    + this.currentThread().getName() + " end");
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
