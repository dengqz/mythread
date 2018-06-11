package UseConditionWaitNotifyError;

/**
 * Created by cheese on 2018/6/11.
 */
public class Run {
    public static void main(String[] args) {
        MyService service = new MyService();
        ThreadA a = new ThreadA(service);
        a.start();
    }
}
