package notifyAll;

/**
 * Created by cheese on 2018/6/10.
 */
public class ThreadC extends Thread {
    private Object lock;
    public ThreadC(Object lock){
        super();
        this.lock=lock;
    }

    @Override
    public void run() {
        Service service = new Service();
        service.testMethod(lock);
    }
}
