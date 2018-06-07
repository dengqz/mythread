package throwExceptionNoLock;

/**
 * Created by cheese on 2018/6/7.
 */
public class ThreadB extends Thread{
    private Service service;
    public ThreadB(Service service){
        super();
        this.service=service;
    }

    @Override
    public void run() {
        service.testMethod();
    }
}
