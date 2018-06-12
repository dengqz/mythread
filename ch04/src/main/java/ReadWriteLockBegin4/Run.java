package ReadWriteLockBegin4;


/**
 * @author : Cheese
 * @date : 2018/6/12
 * @description : TODO
 */
public class Run {
    public static void main(String[] args) throws InterruptedException{
        Service service = new Service();
        ThreadA a = new ThreadA(service);
        ThreadB b = new ThreadB(service);
        b.setName("B");
        b.start();
        Thread.sleep(1000);
        a.setName("A");
        a.start();

    }
}
//读读共享