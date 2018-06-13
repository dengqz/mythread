package threadCreateException;

/**
 * @author : Cheese
 * @date : 2018/6/13
 * @description : TODO
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        String username=null;
        System.out.println(username.hashCode());
    }
}
