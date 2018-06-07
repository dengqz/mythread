package synlockin_2;

/**
 * Created by cheese on 2018/6/7.
 */
public class Run {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
    }
}
//可重入锁也支持在父子类继承的环境中
