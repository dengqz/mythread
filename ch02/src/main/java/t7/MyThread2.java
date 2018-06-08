package t7;

/**
 * @author : Cheese
 * @date : 2018/6/8
 * @description : TODO
 */
public class MyThread2 extends Thread {
    private Task task;
    public MyThread2(Task task){
        super();
        this.task=task;
    }

    @Override
    public void run() {
        super.run();
        task.doLongTimeTask();
    }
}
