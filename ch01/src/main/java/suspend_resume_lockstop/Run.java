package suspend_resume_lockstop;

/**
 * Created by cheese on 2018/6/4.
 */
public class Run {
    public static void main(String[] args) {
        try{
            MyThread thread = new MyThread();
            thread.start();
            Thread.sleep(1000);
            thread.suspend();
            System.out.println("main end!");
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
