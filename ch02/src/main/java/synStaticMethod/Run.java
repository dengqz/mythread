package synStaticMethod;

/**
 * @author : Cheese
 * @date : 2018/6/8
 * @description : TODO
 */
public class Run {
    public static void main(String[] args) {
        ThreadA a = new ThreadA();
        a.setName("A");
        a.start();
        ThreadB b = new ThreadB();
        b.setName("B");
        b.start();
    }
}
