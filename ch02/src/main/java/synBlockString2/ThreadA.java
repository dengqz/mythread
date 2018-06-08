package synBlockString2;

/**
 * @author : Cheese
 * @date : 2018/6/8
 * @description : TODO
 */
public class ThreadA extends Thread {
    private Service service;
    public ThreadA(Service service){
        super();
        this.service=service;
    }

    @Override
    public void run() {
        service.a();
    }
}
