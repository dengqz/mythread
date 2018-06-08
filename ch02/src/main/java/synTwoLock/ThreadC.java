package synTwoLock;

/**
 * @author : Cheese
 * @date : 2018/6/8
 * @description : TODO
 */
public class ThreadC extends Thread {
    private Service service;
    public ThreadC(Service service){
        super();
        this.service=service;
    }

    @Override
    public void run() {
        service.printC();
    }
}
