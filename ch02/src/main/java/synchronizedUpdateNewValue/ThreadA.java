package synchronizedUpdateNewValue;

/**
 * Created by cheese on 2018/6/8.
 */
public class ThreadA extends Thread {
    private Service service;
    public ThreadA(Service service){
        super();
        this.service=service;
    }

    @Override
    public void run() {
        service.runMethod();
    }
}
