package join_sleep_1;

/**
 * @author : Cheese
 * @date : 2018/6/11
 * @description : TODO
 */
public class ThreadA extends Thread {
    private ThreadB b;
    public ThreadA(ThreadB b){
        super();
        this.b=b;
    }

    @Override
    public void run() {
        try{
            synchronized (b){
                b.start();
                Thread.sleep(6000);
                //Thread.sleep();//不释放锁
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
