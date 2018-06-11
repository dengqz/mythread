package ReentrantLockTest;

/**
 * @author : Cheese
 * @date : 2018/6/11
 * @description : TODO
 */
public class MyThread extends Thread{
    private MyService service;
    public MyThread(MyService service){
        super();
        this.service=service;
    }

    @Override
    public void run() {
        service.testMethod();
    }
}
