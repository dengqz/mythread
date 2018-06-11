package join_sleep_2;

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
                b.join();
                for (int i = 0; i < Integer.MAX_VALUE; i++) {
                    String newString = new String();
                    Math.random();
                }
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
