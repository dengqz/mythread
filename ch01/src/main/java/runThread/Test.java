package runThread;

/**
 * Created by cheese on 2018/6/3.
 */
public class Test {
    public static void main(String[] args) {
        Thread runThread = Thread.currentThread();
        System.out.println(runThread.getName()+ " " + runThread.getId());
    }
}
