package threadExceptionMove;

/**
 * @author : Cheese
 * @date : 2018/6/13
 * @description : TODO
 */
public class ObjectUncaughtExceptionHandler implements Thread.UncaughtExceptionHandler {
    @Override
    public void uncaughtException(Thread t, Throwable e) {
        System.out.println("对象的异常处理");
        e.printStackTrace();
    }
}
