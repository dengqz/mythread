package synchronizedBlockLockAll.test3;


/**
 * @author : Cheese
 * @date : 2018/6/8
 * @description : TODO
 */
public class ThreadA extends Thread {
    private Service service;
    private MyObject object;
    public ThreadA(Service service, MyObject object){
        super();
        this.service=service;
        this.object=object;
    }

    @Override
    public void run() {
        super.run();
        service.testMethod1(object);
    }
}
