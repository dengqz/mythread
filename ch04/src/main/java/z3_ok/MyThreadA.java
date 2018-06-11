package z3_ok;

/**
 * Created by cheese on 2018/6/11.
 */
public class MyThreadA extends Thread {
    private MyService myService;
    public MyThreadA(MyService myService){
        super();
        this.myService=myService;
    }

    @Override
    public void run() {
        myService.waitMethod();
    }
}
