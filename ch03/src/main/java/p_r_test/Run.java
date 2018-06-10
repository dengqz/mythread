package p_r_test;

/**
 * Created by cheese on 2018/6/10.
 */
public class Run {
    public static void main(String[] args) {
        String lock= new String("");
        P p = new P(lock);
        C r = new C(lock);
        ThreadP pThread = new ThreadP(p);
        ThreadC rThread = new ThreadC(r);
        pThread.start();
        rThread.start();
    }
}
//一生产与一消费：操作值