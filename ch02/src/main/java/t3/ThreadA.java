package t3;

/**
 * Created by cheese on 2018/6/7.
 */
public class ThreadA extends Thread {
    private PublicVar publicVar;
    public ThreadA(PublicVar publicVar){
        super();
        this.publicVar = publicVar;
    }

    @Override
    public void run() {
        super.run();
        publicVar.setValue("B","BB");
    }
}
