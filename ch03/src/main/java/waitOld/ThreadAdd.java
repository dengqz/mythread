package waitOld;

/**
 * Created by cheese on 2018/6/10.
 */
public class ThreadAdd extends Thread{
    private Add p;
    public ThreadAdd(Add p){
        super();
        this.p=p;
    }

    @Override
    public void run() {
        p.add();
    }
}
