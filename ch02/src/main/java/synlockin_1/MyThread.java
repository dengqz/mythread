package synlockin_1;

/**
 * Created by cheese on 2018/6/7.
 */
public class MyThread extends Thread{
    @Override
    public void run() {
        Service service = new Service();
        service.service1();
    }
}
