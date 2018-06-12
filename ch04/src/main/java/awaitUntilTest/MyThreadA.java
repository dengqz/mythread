package awaitUntilTest;

/**
 * @author : Cheese
 * @date : 2018/6/12
 * @description : TODO
 */
public class MyThreadA extends Thread {
    private Service service;
    public MyThreadA(Service service){
        super();
        this.service=service;
    }

    @Override
    public void run() {
        service.waitMethod();
    }
}
