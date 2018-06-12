package awaitUntilTest;

/**
 * @author : Cheese
 * @date : 2018/6/12
 * @description : TODO
 */
public class MyThreadB extends Thread {
    private Service service;
    public MyThreadB(Service service){
        super();
        this.service=service;
    }

    @Override
    public void run() {
        service.notifyMethod();
    }
}
