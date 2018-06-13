package stateTest1;

/**
 * @author : Cheese
 * @date : 2018/6/13
 * @description : TODO
 */
public class MyThread extends Thread {
    public MyThread(){
        System.out.println("构造方法中的状态："+Thread.currentThread().getState());
    }

    @Override
    public void run() {
        System.out.println("run方法中状态："+Thread.currentThread().getState());
    }
}
