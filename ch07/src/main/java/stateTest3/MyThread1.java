package stateTest3;

/**
 * @author : Cheese
 * @date : 2018/6/13
 * @description : TODO
 */
public class MyThread1 extends Thread {
    @Override
    public void run() {
        MyService.serviceMethod();
    }
}
