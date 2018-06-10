package waitOld;

/**
 * Created by cheese on 2018/6/10.
 */
public class ThreadSubtract extends Thread {
    private Subtract r;
    public ThreadSubtract(Subtract r){
        super();
        this.r=r;
    }

    @Override
    public void run() {
        r.subtract();
    }
}
