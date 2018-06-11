package joinMoreTest;

/**
 * @author : Cheese
 * @date : 2018/6/11
 * @description : TODO
 */
public class RunFirst {
    public static void main(String[] args) {
        ThreadB b = new ThreadB();
        ThreadA a = new ThreadA(b);
        a.start();
        b.start();
        System.out.println(" main end="+ System.currentTimeMillis());
    }
}
