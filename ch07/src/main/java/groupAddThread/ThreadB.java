package groupAddThread;

/**
 * @author : Cheese
 * @date : 2018/6/13
 * @description : TODO
 */
public class ThreadB extends Thread {
    @Override
    public void run() {
        try{
            while(!Thread.currentThread().isInterrupted()){
                System.out.println("线程名："+Thread.currentThread().getName());
                Thread.sleep(3000);
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
