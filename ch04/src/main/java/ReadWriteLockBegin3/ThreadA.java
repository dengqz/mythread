package ReadWriteLockBegin3;


/**
 * @author : Cheese
 * @date : 2018/6/12
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
        service.read();
    }
}
