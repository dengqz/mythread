package p_c_allWait;

/**
 * Created by cheese on 2018/6/10.
 */
public class ThreadC extends Thread {
    private C r;
    public ThreadC(C r){
        super();
        this.r=r;
    }

    @Override
    public void run() {
        while (true){
            r.getValue();
        }
    }
}
