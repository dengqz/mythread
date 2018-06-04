package z;

/**
 * Created by carino on 2018/5/30.
 */
public class MyThread extends Thread {
    private int i;
    public MyThread(int i){
        super();
        this.i = i;
    }

    @Override
    public void run() {
        System.out.println(i);
    }
}
