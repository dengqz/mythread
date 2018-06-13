package singleton_1;

/**
 * @author : Cheese
 * @date : 2018/6/13
 * @description : TODO
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println(MyObject.getInstance().hashCode());
    }
}
