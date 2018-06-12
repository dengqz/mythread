package ReadWriteLockBegin3;


/**
 * @author : Cheese
 * @date : 2018/6/12
 * @description : TODO
 */
public class Run {
    public static void main(String[] args) throws InterruptedException{
        Service service = new Service();
        ThreadA a = new ThreadA(service);
        a.setName("A");
        a.start();
        Thread.sleep(1000);
        ThreadB b = new ThreadB(service);
        b.setName("B");
        b.start();
    }
}
//读读共享