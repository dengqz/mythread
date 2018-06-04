package t4_threadsafe;

/**
 * Created by carino on 2018/5/30.
 */
public class Run {
    public static void main(String[] args) {
        ALogin a = new ALogin();
        a.start();
        BLogin b = new BLogin();
        b.start();
    }
}
//解决非线程安全问题，同样使用synchronized关键字