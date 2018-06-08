package synchronizedOneThreadIn;

/**
 * @author : Cheese
 * @date : 2018/6/8
 * @description : TODO
 */
public class ThreadA extends Thread {
    private ObjectService service;
    public ThreadA(ObjectService service){
        super();
        this.service=service;
    }

    @Override
    public void run() {
        super.run();
        service.serviceMethod();
    }
}
