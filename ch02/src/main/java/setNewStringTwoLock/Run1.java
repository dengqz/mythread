package setNewStringTwoLock;

/**
 * Created by cheese on 2018/6/8.
 */
public class Run1 {
    public static void main(String[] args) throws InterruptedException{
        MyService service = new MyService();
        ThreadA a = new ThreadA(service);
        a.setName("A");
        ThreadB b = new ThreadB(service);
        b.setName("B");
        a.start();
        Thread.sleep(50);
        b.start();
    }
}
