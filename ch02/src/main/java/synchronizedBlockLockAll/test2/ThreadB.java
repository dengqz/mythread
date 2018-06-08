package synchronizedBlockLockAll.test2;

/**
 * @author : Cheese
 * @date : 2018/6/8
 * @description : TODO
 */
public class ThreadB extends Thread {
    private MyObject object;
    public ThreadB(MyObject object){
        super();
        this.object=object;
    }

    @Override
    public void run() {
        super.run();
        object.speedPrintString();
    }
}
