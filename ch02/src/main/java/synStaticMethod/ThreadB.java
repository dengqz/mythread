package synStaticMethod;

/**
 * @author : Cheese
 * @date : 2018/6/8
 * @description : TODO
 */
public class ThreadB extends Thread{
    @Override
    public void run() {
        Service.printB();
    }
}
