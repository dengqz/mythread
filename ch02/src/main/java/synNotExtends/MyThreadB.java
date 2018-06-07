package synNotExtends;

/**
 * Created by cheese on 2018/6/7.
 */
public class MyThreadB extends Thread {
    private Sub sub;
    public MyThreadB(Sub sub){
        super();
        this.sub=sub;
    }

    @Override
    public void run() {
        sub.serviceMethod();
    }
}
