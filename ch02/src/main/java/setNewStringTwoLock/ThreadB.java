package setNewStringTwoLock;

/**
 * Created by cheese on 2018/6/8.
 */
public class ThreadB extends Thread {
    private MyService service;
    public ThreadB(MyService service){
        super();
        this.service=service;
    }

    @Override
    public void run() {
        service.testMethod();
    }
}
