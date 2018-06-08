package innerTest1;

/**
 * @author : Cheese
 * @date : 2018/6/8
 * @description : TODO
 */
public class Run {
    public static void main(String[] args) {
        final OutClass.Inner inner  = new OutClass.Inner();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                inner.method1();
            }
        },"A");
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                inner.method2();
            }
        },"B");
        t1.start();
        t2.start();
    }
}
