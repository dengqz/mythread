package notifyHoldLock;

/**
 * Created by cheese on 2018/6/10.
 */
public class NotifyThread extends Thread {
    private Object lock;
    public NotifyThread(Object lock){
        super();
        this.lock = lock;
    }

    @Override
    public void run() {
        Service service = new Service();
        service.synNotifyMeThod(lock);
    }
}
