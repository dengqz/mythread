package synStaticMethod;

/**
 * @author : Cheese
 * @date : 2018/6/8
 * @description : TODO
 */
public class ThreadA extends Thread {
    @Override
    public void run() {
        Service.printA();
    }
}
