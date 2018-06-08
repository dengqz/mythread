package twoStop;

/**
 * @author : Cheese
 * @date : 2018/6/8
 * @description : TODO
 */
public class ThreadB extends Thread {
    private Service service;
    public ThreadB(Service service){
        super();
        this.service=service;
    }

    @Override
    public void run() {
        service.methodB();
    }
}
