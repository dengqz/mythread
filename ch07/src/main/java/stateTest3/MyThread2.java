package stateTest3;

/**
 * @author : Cheese
 * @date : 2018/6/13
 * @description : TODO
 */
public class MyThread2 extends Thread {
    @Override
    public void run() {
        MyService.serviceMethod();
    }
}
