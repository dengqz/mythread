package MustUseMoreCondition_Error;

/**
 * Created by cheese on 2018/6/11.
 */
public class ThreadB extends Thread {
    private MyService service;
    public ThreadB(MyService service){
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.awaitB();
    }
}
