package twoStop;

/**
 * @author : Cheese
 * @date : 2018/6/8
 * @description : TODO
 */
public class Run {
    public static void main(String[] args) {
        Service service = new Service();
        ThreadA athread = new ThreadA(service);
        athread.start();
        ThreadB bthread = new ThreadB(service);
        bthread.start();
    }
}
