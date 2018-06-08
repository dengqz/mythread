package t8;

/**
 * @author : Cheese
 * @date : 2018/6/8
 * @description : TODO
 */
public class MyThread1 extends Thread{
    private Task task;
    public MyThread1(Task task){
        super();
        this.task=task;
    }

    @Override
    public void run() {
        super.run();
        task.doLongTimeTask();
    }
}
