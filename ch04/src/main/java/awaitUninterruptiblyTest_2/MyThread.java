package awaitUninterruptiblyTest_2;

/**
 * @author : Cheese
 * @date : 2018/6/12
 * @description : TODO
 */
public class MyThread extends Thread {
    private Service service;
    public MyThread(Service service){
        super();
        this.service= service;
    }

    @Override
    public void run() {
        service.testMethod();
    }
}
