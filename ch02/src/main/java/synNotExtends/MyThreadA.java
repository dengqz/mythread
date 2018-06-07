package synNotExtends;


/**
 * Created by cheese on 2018/6/7.
 */
public class MyThreadA extends Thread {
    private Sub sub;
    public MyThreadA(Sub sub){
        super();
        this.sub=sub;
    }

    @Override
    public void run() {
        sub.serviceMethod();
    }
}
