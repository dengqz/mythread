package join_sleep_1;

/**
 * @author : Cheese
 * @date : 2018/6/11
 * @description : TODO
 */
public class ThreadC extends Thread {
    private ThreadB threadB;
    public ThreadC(ThreadB threadB){
        super();
        this.threadB=threadB;
    }

    @Override
    public void run() {
        threadB.bService();
    }
}
