package synchronizedBlockLockAll.test1;

/**
 * @author : Cheese
 * @date : 2018/6/8
 * @description : TODO
 */
public class Run1_1 {
    public static void main(String[] args) {
        Service service = new Service();
        MyObject object = new MyObject();
        ThreadA a = new ThreadA(service,object);
        a.setName("a");
        a.start();
        ThreadB b = new ThreadB(service,object);
        b.setName("b");
        b.start();
    }
}
