package UseConditionWaitNotifyError;

/**
 * Created by cheese on 2018/6/11.
 */
public class ThreadA extends Thread {
    private MyService service;
    public ThreadA(MyService service){
        super();
        this.service=service;
    }

    @Override
    public void run() {
        service.await();
    }
}
