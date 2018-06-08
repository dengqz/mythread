package atomicIntergerNoSafe;

/**
 * Created by cheese on 2018/6/8.
 */
public class MyThread extends Thread {
    private MyService myService;
    public MyThread(MyService myService){
        super();
        this.myService=myService;
    }

    @Override
    public void run() {
        myService.addNum();
    }
}
