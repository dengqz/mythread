package threadExceptionMove;

/**
 * @author : Cheese
 * @date : 2018/6/13
 * @description : TODO
 */
public class Run {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        //对象
        //myThread.setUncaughtExceptionHandler(new ObjectUncaughtExceptionHandler());
        //类
        MyThread.setDefaultUncaughtExceptionHandler(new StateUncaughtExceptionHandler());
        myThread.start();
    }
}
