package stateTest3;

/**
 * @author : Cheese
 * @date : 2018/6/13
 * @description : TODO
 */
public class Run {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        t1.setName("a");
        t1.start();
        MyThread2 t2 = new MyThread2();
        t2.setName("b");
        t2.start();
        System.out.println("main方法中的t2状态："+t2.getState());
    }
}
