package synlockin_1;

/**
 * Created by cheese on 2018/6/7.
 */
public class Run {
    public static void main(String[] args) {
        MyThread t =new MyThread();
        t.start();
    }
}
//锁重入