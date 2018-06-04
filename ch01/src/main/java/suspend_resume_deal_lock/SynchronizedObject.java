package suspend_resume_deal_lock;

/**
 * Created by cheese on 2018/6/4.
 */
public class SynchronizedObject {
    synchronized public void printString(){
        System.out.println("begin");
        if(Thread.currentThread().getName().equals("a")){
            System.out.println("a线程永远suspend了！");
            Thread.currentThread().suspend();
        }
        System.out.println("end");
    }
}
