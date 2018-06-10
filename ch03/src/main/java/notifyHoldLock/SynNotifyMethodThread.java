package notifyHoldLock;

/**
 * Created by cheese on 2018/6/10.
 */
public class SynNotifyMethodThread extends Thread {
    private Object lock;
    public SynNotifyMethodThread(Object lock){
        super();
        this.lock=lock;
    }

    @Override
    public void run() {
        Service service = new Service();
        service.synNotifyMeThod(lock);
    }
}
