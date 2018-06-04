package stopThrowLock;

/**
 * Created by cheese on 2018/6/3.
 */
public class MyThread extends Thread {
    private SynchronizedObject object;
    public MyThread(SynchronizedObject object){
        super();
        this.object = object;
    }

    @Override
    public void run() {
        object.printString("b","bb");
    }
}
