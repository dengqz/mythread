package t6;

/**
 * @author : Cheese
 * @date : 2018/6/8
 * @description : TODO
 */
public class MyThread2 extends Thread {
    private Task task;
    public MyThread2(Task task){
        super();
        this.task = task;
    }

    @Override
    public void run() {
        super.run();
        CommonUtils.beginTime2 = System.currentTimeMillis();
        task.doLongTimeTask();
        CommonUtils.endTime2 = System.currentTimeMillis();
    }
}
