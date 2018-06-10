package p_r_test;

/**
 * Created by cheese on 2018/6/10.
 */
public class ThreadP extends Thread {
    private P p;
    public ThreadP(P p){
        super();
        this.p=p;
    }

    @Override
    public void run() {
        while (true){
            p.setValue();
        }
    }
}
