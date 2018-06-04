package callMainMethodMainThread;

/**
 * Created by carino on 2018/6/3.
 */
public class Test {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
    }
}
//控制台输出：main
//说明正在执行的线程名为main
