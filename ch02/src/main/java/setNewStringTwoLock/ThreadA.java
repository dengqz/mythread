package setNewStringTwoLock;

/**
 * Created by cheese on 2018/6/8.
 */
public class ThreadA extends Thread {
    private MyService service;
    public ThreadA(MyService service){
        super();
        this.service=service;
    }

    @Override
    public void run() {
        service.testMethod();
    }
}
