package t8;

/**
 * @author : Cheese
 * @date : 2018/6/8
 * @description : TODO
 */
public class Run {
    public static void main(String[] args) throws InterruptedException{
        Task task = new Task();
        MyThread1 thread1 = new MyThread1(task);
        thread1.start();
        Thread.sleep(50);
        MyThread2 thread2 = new MyThread2(task);
        thread2.start();
    }
}
//验证同步synchronized(this)代码块是锁定当前对象的