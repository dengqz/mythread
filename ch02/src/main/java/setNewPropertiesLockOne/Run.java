package setNewPropertiesLockOne;

/**
 * Created by cheese on 2018/6/8.
 */
public class Run {
    public static void main(String[] args) {

        try {
            Service service = new Service();
            Userinfo userinfo = new Userinfo();

            ThreadA a = new ThreadA(service, userinfo);
            a.setName("a");
            a.start();
            Thread.sleep(50);
            ThreadB b = new ThreadB(service, userinfo);
            b.setName("b");
            b.start();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
