package synvhronizedmethodlockobject;

/**
 * Created by cheese on 2018/6/6.
 */
public class ThreadA extends Thread{
    private MyObject object;
    public ThreadA(MyObject object){
        super();
        this.object = object;
    }

    @Override
    public void run() {
        super.run();
        object.methodA();
    }
}
