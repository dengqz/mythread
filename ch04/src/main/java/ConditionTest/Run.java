package ConditionTest;

/**
 * @author : Cheese
 * @date : 2018/6/12
 * @description : TODO
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        MyService myService = new MyService();
        MyThreadA a = new MyThreadA(myService);
        a.start();
        MyThreadB b = new MyThreadB(myService);
        b.start();
    }
}
