package z3_ok;

/**
 * Created by cheese on 2018/6/11.
 */
public class Run {
    public static void main(String[] args) {
        MyService myService = new MyService();
        MyThreadA a = new MyThreadA(myService);
        a.start();
    }
}
